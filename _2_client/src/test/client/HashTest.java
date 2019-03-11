package client;

import org.junit.Test;

import java.security.NoSuchAlgorithmException;

import static client.Hash.generateHash;
import static org.junit.Assert.*;

public class HashTest {

    @Test
    public void generateHashTest() throws NoSuchAlgorithmException {
        String Test = generateHash("test", "SHA-256");
        assertEquals("9F86D081884C7D659A2FEAA0C55AD015A3BF4F1B2B0B822CD15D6C15B0F00A08", Test);
    }

    @Test
    public void generateHashTest2() throws NoSuchAlgorithmException {
        String Test = generateHash("Test", "SHA-256");
        assertNotEquals("9F86D081884C7D659A2FEAA0C55AD015A3BF4F1B2B0B822CD15D6C15B0F00A08", Test);
    }
}