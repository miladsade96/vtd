package main.java;

public class VirtualThreadsDemo {

    public static void usingOldSchoolThreads() throws InterruptedException {
        for (int i = 0; i < 50000; i++) {
            Thread thread = new Thread(SampleRunnable.task());  // 38280 ms in my machine
            thread.start();
            thread.join();
        }

}
