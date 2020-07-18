package pl.noiseapps.patterns.strategy;

public class PlainTextAlgo implements PasswordHashingAlgo {
    
    @Override
    public String hash(String plainText, String salt) {
        return plainText;
    }
}
