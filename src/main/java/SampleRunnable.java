package main.java;

import java.util.Random;

public class SampleRunnable {
    public static Runnable task() {
        Random random = new Random();
        return () -> {
            double result = random.nextDouble(1000) * random.nextDouble(1000);
            System.out.println("Task executed with result: " + result);
        };
    }
}
