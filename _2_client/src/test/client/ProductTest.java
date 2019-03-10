package client;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void getEmail() {
        Product product1 = new Product("zijltijs@gmail.com", "zijltijs", "genericpw");
        assertEquals("zijltijs@gmail.com", product1.getEmail());
    }

    @Test
    public void setEmail() {
        Product product1 = new Product("zijltijs@gmail.com", "zijltijs", "genericpw");
        product1.setEmail("notzijltijs@gmail.com");
        assertEquals("notzijltijs@gmail.com", product1.getEmail());
    }

    @Test
    public void getUsername() {
        Product product1 = new Product("zijltijs@gmail.com", "zijltijs", "genericpw");
        assertEquals("zijltijs", product1.getUsername());
    }

    @Test
    public void setUsername() {
        Product product1 = new Product("zijltijs@gmail.com", "zijltijs", "genericpw");
        product1.setUsername("notzijltijs");
        assertEquals("notzijltijs", product1.getUsername());
    }

    @Test
    public void getPassword() {
        Product product1 = new Product("zijltijs@gmail.com", "zijltijs", "genericpw");
        assertEquals("genericpw", product1.getPassword());
    }

    @Test
    public void setPassword() {
        Product product1 = new Product("zijltijs@gmail.com", "zijltijs", "genericpw");
        product1.setPassword("notgenericpw");
        assertEquals("notgenericpw", product1.getPassword());
    }

    @Test
    public void Product() {
        Product product1 = new Product();
        assertEquals("", product1.getUsername());
    }
}