package hello;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class UserTest {

    User u1;
    User u2;

    @BeforeEach
    public void setUp() throws Exception {
        u1 = new User(1,"Florentin",19);
        u2 = new User(2,"Andrei",18);
    }

    @AfterAll
    public void tearDown() throws Exception {
        u1 = null;
        u2 = null;
    }

    @Test
    public void getIdTest() {
        assertEquals(1,u1.getId());
    }

    @Test
    public void setIdTest() {
        u1.setId(11);
        assertEquals(11,u1.getId());
    }

    @Test
    public void getNameTest() {
        assertEquals("Florentin", u1.getName());
    }

    @Test
    public void setNameTest() {
        u1.setName("NotFlorentin");
        assertEquals(u1.getName(),"NotFlorentin");
    }

    @Test
    public void getAgeTest() {
        assertEquals(19,u1.getAge());
    }

    @Test
    public void setAgeTest() {
        u1.setAge(20);
        assertEquals(20, u1.getAge());
    }

    @Test
    public void toStringTest() {
        assertEquals("User Info: id = 2, name = Andrei, age = 18", u2.toString());
    }
}