package main.java;

import java.util.Scanner;

public class VirtualThreadsDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting Virtual Threads Demo...");

        System.out.println("Choose a method to run:");
        System.out.println("1. Using old school threads");
        System.out.println("2. Using ofVirtual method");
        System.out.println("3. Using startVirtualThread method");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.close();

        long startTime = System.currentTimeMillis();

        switch (choice) {
            case 1:
                System.out.println("Using old school threads...");
                usingOldSchoolThreads();
                break;
            case 2:
                System.out.println("Using ofVirtual method...");
                usingOfVirtualMethod();
                break;
            case 3:
                System.out.println("Using startVirtualThread method...");
                usingStartVirtualThreadMethod();
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                return;
        }

        long endTime = System.currentTimeMillis();
        System.out.println("All tasks completed.");
        System.out.println("Total time taken: " + (endTime - startTime) + " milliseconds.");
    }

    public static void usingOldSchoolThreads() throws InterruptedException {
        for (int i = 0; i < 50000; i++) {
            Thread thread = new Thread(SampleRunnable.task());  // 38280 ms in my machine
            thread.start();
            thread.join();
        }

    }

    public static void usingOfVirtualMethod() throws InterruptedException {
        for (int i = 0; i < 50000; i++) {
            Thread.ofVirtual().start(SampleRunnable.task()).join();     // 6990 ms in my machine
        }
    }

    public static void usingStartVirtualThreadMethod() throws InterruptedException {
        for (int i = 0; i < 50000; i++) {
            Thread.startVirtualThread(SampleRunnable.task()).join();   // 6162 ms in my machine
        }
    }
}
