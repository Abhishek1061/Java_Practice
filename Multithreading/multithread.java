package Multithreading;

public class multithread extends Thread{
    public void run(){
        System.out.println("Thread Operational");
    }

    public static void main(String[] args) {
        multithread Thread_a = new multithread();
        multithread Thread_b = new multithread();
        multithread Thread_c = new multithread();
        Thread_a.start();
        Thread_b.start();
        Thread_c.start();
    }
}
