package pl.noiseapps.patterns.strategy;

public interface PasswordHashingAlgo {

    String hash(String plainText, String salt);

}
