package pl.noiseapps.patterns.strategy;

import java.util.Random;

public class PasswordService {

    private PasswordHashingAlgo hashingAlgo;

    public void setHashingAlgo(PasswordHashingAlgo hashingAlgo) {
        this.hashingAlgo = hashingAlgo;
    }

    public void save(String plainText) {
        String salt = randomSalt();
        System.out.println("Salt for user: " + salt); // save salt to database
        String hash = hashingAlgo.hash(plainText, salt);
        System.out.println("Received hashed password: " + hash); // save hashed password to database
        System.out.println();
    }

    private String randomSalt() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }
}
