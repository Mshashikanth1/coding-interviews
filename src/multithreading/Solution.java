package multithreading;

public class Solution {

    public static void main(String[] args) throws InterruptedException {


        SharedResource sharedResource = new SharedResource();

        System.out.println( Thread.currentThread().getName());


        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000 ; i++) {
                sharedResource.increment();
            }
        });

        t1.start();
        t1.join();

        System.out.println(t1.getName());


        System.out.println(sharedResource.getCount());
    }
}
