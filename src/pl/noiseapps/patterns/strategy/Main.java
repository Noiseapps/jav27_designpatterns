package pl.noiseapps.patterns.strategy;

public class Main {


    public static void main(String[] args) {
        PasswordService passwordService = new PasswordService();

        int userId = 0;
        passwordService.setHashingAlgo(HashingAlgoFactory.getAlgorithmForUser(userId));
        passwordService.save("test");
        passwordService.save("test");
        passwordService.setHashingAlgo(HashingAlgoFactory.getAlgorithmForUser(userId));
        passwordService.save("test");
        passwordService.save("test");
        passwordService.save("test");
    }
}
