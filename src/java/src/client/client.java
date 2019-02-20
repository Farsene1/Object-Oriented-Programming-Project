package client;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class client {

    //Main
    public static void main(String[] args) throws NoSuchAlgorithmException{

        String data = "PasswordExample";
        String algorithm = "SHA-256";
        System.out.println("SHA-256 Hash: " + generateHash(data, algorithm));

    }

    //Method for generating hash from text with variable hashing algorithm
    private static String generateHash(String data, String algorithm) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance(algorithm);
        digest.reset();
        byte[] hash = digest.digest(data.getBytes());
        return bytesToStringHex(hash);
    }

    private final static char[] hexArray = "0123456789ABCDEF".toCharArray();

    //Converts byteArray to String
    private static String bytesToStringHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int i =0; i < bytes.length; i++) {
            int x = bytes[i] & 0xFF;
            hexChars[i * 2] = hexArray[x >>> 4];
            hexChars[i * 2 + 1] = hexArray[x & 0x0F];
        }
        return new String(hexChars);
    }
}
