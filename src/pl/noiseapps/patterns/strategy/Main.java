package pl.noiseapps.patterns.strategy;

public class Main {


    public static void main(String[] args) {
        PasswordService passwordService = new PasswordService();
        passwordService.setHashingAlgo(new PlainTextAlgo());
        passwordService.save("test");
        passwordService.save("test");
        passwordService.setHashingAlgo(new MD5HashingAlgo());
        passwordService.save("test");
        passwordService.save("test");
        passwordService.save("test");
    }
}
