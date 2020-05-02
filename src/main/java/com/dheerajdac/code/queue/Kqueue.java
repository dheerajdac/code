package com.dheerajdac.code.queue;

public class Kqueue{

    int arr[];
    int top[];
    int rear[];
    int next[];
    int free;

    public Kqueue(int n ,int  k) {
        arr = new int[n];
        top = new int[k];
        rear = new int[k];
        next = new int[n];

        for (int i = 0; i < next.length - 1; i++) {
            next[i] = i + 1;
        }
        next[next.length -1] = -1;
        for (int i = 0; i < top.length; i++) {
            top[i] = -1;
            rear[i] = -1;
        }
        this.free = 0;
    }

    public void enqueue(int value, int q){
        if(!isFull(q)){
            int i = free;
            if(top[q] == -1){
                top[q] = i;
            }
            free = next[i];



            if(rear[q] != -1){
                next[i] = rear[q];
            }
            rear[q] = i;



            arr[i] = value;
        } else {
            System.out.println("full");
        }
    }

    public int dequeue(int q){
        if(!isEmpty(q)){
            int i = top[q];
            top[q] = next[i];
            next[i] = free;
            free = i;
            return arr[i];
        } else {
            System.out.println("empty");
        }
        return 0;
    }

    public boolean isEmpty(int q){
        return top[q] == -1;
    }

    public boolean isFull(int q){
        return this.free == -1;
    }


    public static void main(String[] args){
        int k = 3, n = 10;  
        Kqueue ks=  new Kqueue(n, k);  
         
          
        // Let us put some items in queue number 2  
        ks.enqueue(15, 2);  
        ks.enqueue(45, 2);  
        
        // Let us put some items in queue number 1  
        ks.enqueue(17, 1);  
        ks.enqueue(49, 1);  
        ks.enqueue(39, 1);  
        
        // Let us put some items in queue number 0  
        ks.enqueue(11, 0);  
        ks.enqueue(9, 0);  
        ks.enqueue(7, 0);  
          
        System.out.println("Dequeued element from queue 2 is " +  
                                ks.dequeue(2));  
        System.out.println("Dequeued element from queue 1 is " +  
                                ks.dequeue(1));  
        System.out.println("Dequeued element from queue 0 is " +  
                                ks.dequeue(0) ); 
    }
}