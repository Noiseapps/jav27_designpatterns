package pl.noiseapps.patterns.singleton;

import java.util.Random;

public class DoubleCheckLocking {
    private static DoubleCheckLocking instance;

    public static DoubleCheckLocking getInstance() {
        System.out.printf("Thread %d called getInstance\n", Thread.currentThread().getId());
        if(instance == null) {
            System.out.printf("Thread %d wants to create instance\n", Thread.currentThread().getId());
            synchronized (DoubleCheckLocking.class) {
                System.out.printf("Thread %d in synchronized block\n", Thread.currentThread().getId());
                if(instance == null) {
                    System.out.printf("Thread %d creates instance\n", Thread.currentThread().getId());
                    Random r = new Random();
                    instance = new DoubleCheckLocking(r.nextInt());
                    System.out.printf("Thread %d created instance\n", Thread.currentThread().getId());
                } else {
                    System.out.printf("Thread %d already uses created instance\n", Thread.currentThread().getId());
                }
            }
        }
        return instance;
    }

    private final int identifier;

    public DoubleCheckLocking(int identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "DoubleCheckLocking{" +
                "identifier=" + identifier +
                '}';
    }
}
