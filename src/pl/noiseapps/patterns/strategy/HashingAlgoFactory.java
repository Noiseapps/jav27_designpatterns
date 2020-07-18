package pl.noiseapps.patterns.strategy;

public class HashingAlgoFactory {

    private static final int appVersion = 150;

    public static PasswordHashingAlgo getAlgorithmForUser(int userId) {
        if(appVersion == 148) {
            return new SpecialCaseHashingAlgo();
        }
        if (userId > 1000) {
            return new PlainTextAlgo();
        } else {
            return new MD5HashingAlgo();
        }
    }
}
