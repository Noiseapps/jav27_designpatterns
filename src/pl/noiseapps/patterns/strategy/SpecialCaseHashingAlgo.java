package pl.noiseapps.patterns.strategy;

public class SpecialCaseHashingAlgo implements PasswordHashingAlgo {
    @Override
    public String hash(String plainText, String salt) {
        return null;
    }
}
