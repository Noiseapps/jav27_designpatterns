package pl.noiseapps.patterns.singleton;

import java.util.Random;

public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton(new Random().nextInt());

    public static EagerSingleton getInstance() {
        return instance;
    }

    private final int identifier;

    private EagerSingleton(int identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "EagerSingleton{" +
                "identifier=" + identifier +
                '}';
    }
}
