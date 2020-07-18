package pl.noiseapps.patterns.singleton;

import java.util.Random;

public enum EnumSingleton {
    INSTANCE;

    private final int identifier;

    private EnumSingleton() {
        Random r = new Random();
        identifier = r.nextInt();
    }

    @Override
    public String toString() {
        return "EnumSingleton{" +
                "identifier=" + identifier +
                '}';
    }
}

