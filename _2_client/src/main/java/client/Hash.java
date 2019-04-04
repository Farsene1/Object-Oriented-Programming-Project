package client;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Class hashing.
 */
public class Hash {


    /**
     * Hash generator.
     *
     * @param data      parameter data.
     * @param algorithm parameter algorithm.
     * @return returns a hash.
     * @throws NoSuchAlgorithmException exception thrown
     */
    public static String generateHash(final String data, final String algorithm) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance(algorithm);
        digest.reset();
        byte[] hash = digest.digest(data.getBytes());
        return bytesToStringHex(hash);
    }

    /**
     * variable array.
     */
    private static final char[] HEXARRAY = "0123456789ABCDEF".toCharArray();

    /**
     * Bytes to string.
     *
     * @param bytes PARAMETER byte
     * @return returns a string of hex character.
     */
    private static String bytesToStringHex(final byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int i = 0; i < bytes.length; i++) {
            int x = bytes[i] & 0xFF;
            hexChars[i * 2] = HEXARRAY[x >>> 4];
            hexChars[i * 2 + 1] = HEXARRAY[x & 0x0F];
        }
        return new String(hexChars);
    }
}