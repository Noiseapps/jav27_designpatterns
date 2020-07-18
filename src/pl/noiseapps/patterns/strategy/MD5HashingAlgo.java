package pl.noiseapps.patterns.strategy;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5HashingAlgo implements PasswordHashingAlgo{


    @Override
    public String hash(String plainText, String salt) {
        try {
            String plainSalted = String.format("%s.%s", salt, plainText);
            byte[] inputBytes = plainSalted.getBytes();
            byte[] outputBytes = MessageDigest.getInstance("MD5").digest(inputBytes);
            return new HexBinaryAdapter().marshal(outputBytes);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
