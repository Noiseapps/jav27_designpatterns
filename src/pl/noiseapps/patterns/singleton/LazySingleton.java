package pl.noiseapps.patterns.singleton;

import java.util.Random;

public class LazySingleton {

    private static LazySingleton instance;

    private final int identifier;

    public static LazySingleton getInstance() {
        if(instance == null) {
            Random r = new Random();
            instance = new LazySingleton(r.nextInt());
        }
        return instance;
    }

    private LazySingleton(int identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "LazySingleton{" +
                "identifier=" + identifier +
                '}';
    }
}
