package com.dheerajdac.code.dp;

import java.util.*;

public class Library implements Lib{

    Map<String , SearchStrategy> searchStrategyMap;
    List<Book> books = new ArrayList<>();
    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public Library(){
        this.books = new ArrayList<>();
        searchStrategyMap = new HashMap<>();
        searchStrategyMap.put("author" , new SearchByAuthor());
        searchStrategyMap.put("name" , new SearchByBookName());
    }


    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public boolean loanBook(String userId, String name) {
        if(userDao.getUser(userId) != null && userDao.getUser(userId).getStatus().equals(RegistrationStatus.REGISTERED)){
            Book book = this.search("name", name);
            synchronized (books){
                if(!book.isTaken) {
                    book.setTaken(true);
                    System.out.println("Book "+ name + " issued to user " + userId);
                    return true;
                }
            }
        }
        System.out.println("Book is already loaned");
        return false;
    }

    @Override
    public Book search(String strategy, String value) {
        SearchStrategy searchStrategy = searchStrategyMap.get(strategy);
        return searchStrategy.search(books, value);
    }

    public static void main(String[] args) {

        SubjectImpl subject = new SubjectImpl();
        UserDao userDao = new UserDaoImpl();
        userDao.setSubject(subject);
        Admin admin = new AdminImpl();
        admin.setSubject(subject);
        Library library = new Library();
        library.setUserDao(userDao);
        Book book1 = new Book("abc" , "def" , "awda");
        Book book2 = new Book("abcss" , "desdasdf" , "awsfsdda");
        Book book3 = new Book("abcasd" , "dwqygeef" , "awda");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        UserRegistration userRegistration = new UserRegistrationImpl(userDao, subject);
        userRegistration.registerUser(new User("1"));
        userRegistration.registerUser(new User("2"));
        userRegistration.registerUser(new User("3"));

        admin.approveUser(admin.getPendingUser());
        admin.approveUser(admin.getPendingUser());
        admin.declineUser(admin.getPendingUser());

        userRegistration.registerUser(new User("1"));
        userRegistration.registerUser(new User("2"));
        userRegistration.registerUser(new User("3"));

        library.loanBook("1", "abc");
        library.loanBook("2", "abc");
        library.loanBook("12", "abcss");
        library.loanBook("2", "abcss");
        library.loanBook("3", "abcasd");

    }

}


interface UserDao extends Observer{

    Map<String, User> getUserList();

    void addUser(User user);

    User getUser(String userID);

}

class UserDaoImpl implements UserDao{

    Map<String, User> userMap = new HashMap<>();
    Subject subject;

    @Override
    public Map<String, User> getUserList() {
        return userMap;
    }

    @Override
    public void addUser(User user) {
        userMap.put(user.userId , user);
    }

    @Override
    public  User getUser(String userID) {
        return userMap.get(userID);
    }

    @Override
    public void update() {
        this.addUser((User) this.subject.getUpdate());
    }

    @Override
    public void setSubject(Subject sub) {
        this.subject = sub;
        this.subject.register(this);
    }
}

class Book {
    String name;
    String author;
    String category;
    boolean isTaken;

    public Book(String name, String author, String category) {
        this.name = name;
        this.author = author;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isTaken() {
        return isTaken;
    }

    public void setTaken(boolean taken) {
        isTaken = taken;
    }
}

interface Lib {

    void addBook(Book book);

    boolean loanBook(String userId, String name);

    Book search(String strategy, String value);
}


interface UserRegistration {

    boolean validate(User user);

    RegistrationStatus registerUser(User user);

}

class UserRegistrationImpl implements UserRegistration{

    UserDao userDao;

    SubjectImpl subject;

    public UserRegistrationImpl(UserDao userDao, SubjectImpl subject) {
        this.userDao = userDao;
        this.subject = subject;
    }

    public void setSubject(SubjectImpl subject) {
        this.subject = subject;
    }


    public boolean validate(User user) {
        return userDao.getUser(user.userId) != null;
    }


    public RegistrationStatus registerUser(User user) {
        if (!validate(user)) {
            System.out.println("Adding user " + user.getUserId() + "registration " + RegistrationStatus.PENDING);
            subject.addUser(user);
            return RegistrationStatus.PENDING;
        }else{
            RegistrationStatus res = userDao.getUser(user.userId).getStatus();
            System.out.println("User already exists with status " + res);
            return res;
        }
    }


}

interface Subject {

    public void register(Observer obj);
    
    public void unregister(Observer obj);
    
    public void notifyAllObservers();

    public Object getUpdate();

}

interface Observer {

    public void update();
    
    public void setSubject(Subject sub);
    
}

class SubjectImpl implements Subject {

    private List<Observer> observers;
    private User user;

    public SubjectImpl(){
        this.observers=new ArrayList<>();
    }
    
    @Override
    public void register(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer obj : observers) {
            obj.update();
        }
    }

    @Override
    public Object getUpdate() {
        return this.user;
    }

    public void addUser(User user){
        this.user =user;
        notifyAllObservers();
    }
}

interface Admin extends Observer{

    public User getPendingUser();

    public void approveUser(User user);

    public void declineUser(User user);
}

class AdminImpl implements Admin{

    private Subject subject;
    private LinkedList<User> pendingUser = new LinkedList<>();;

    @Override
    public void update() {
        pendingUser.add((User) subject.getUpdate());
    }

    @Override
    public void setSubject(Subject sub) {
        this.subject =sub;
        this.subject.register(this);
    }


    @Override
    public User getPendingUser() {
        return pendingUser.poll();
    }

    @Override
    public void approveUser(User user) {
        System.out.println("Approved user " + user.getUserId());
        user.setStatus(RegistrationStatus.REGISTERED);
    }

    @Override
    public void declineUser(User user) {
        System.out.println("Decline user " + user.getUserId());
        user.setStatus(RegistrationStatus.DENIED);
    }

}

enum RegistrationStatus {
    PENDING,
    REGISTERED,
    DENIED
}

interface SearchStrategy {

    Book search(List<Book> books, String value);

}

class SearchByAuthor implements SearchStrategy{

    @Override
    public Book search(List<Book> books, String value) {
        for (Book book: books) {
            if (book.author.equals(value)) {
                return book;
            }
        }
        return null;
    }

}

class SearchByBookName implements SearchStrategy {
    @Override
    public Book search(List<Book> books, String value) {
        for (Book book: books) {
            if (book.name.equals(value)) {
                return book;
            }
        }
        return null;
    }
}

class User {

    String userId;
    RegistrationStatus status;

    public User(String userId) {
        this.userId = userId;
        status = RegistrationStatus.PENDING;
    }

    public RegistrationStatus getStatus() {
        return status;
    }

    public void setStatus(RegistrationStatus status) {
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}