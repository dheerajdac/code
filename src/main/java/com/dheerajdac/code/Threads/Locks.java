package com.dheerajdac.code.Threads;

public class Locks {

    private class Nofity {

        public Nofity() {
            synchronized(Nofity.class){

            }
        }

        private String obj = new String("Dheeraj");
        private boolean hasNotified = false;
        private int counter = 0;
        public void doWait() throws InterruptedException {
            synchronized(obj) {
                while(!hasNotified){
                    obj.wait();
                    System.out.println(++counter);
                }
            }
        }

        public void doNotify(){
            synchronized(obj) {
                hasNotified = true;
                obj.notifyAll();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("daf");
    }

}

