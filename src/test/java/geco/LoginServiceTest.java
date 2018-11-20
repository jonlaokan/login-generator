package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {

    private ArrayList<String> logins = new ArrayList<>();
    private String[] listArray;

    @Before
    public void setUp() throws Exception {
        logins.add("Bobo");
        logins.add("SuperPierre");
        listArray = logins.toArray(new String[0]);
    }

    @Test
    public void testLoginExists() {
        LoginService ls = new LoginService(listArray);
        assertEquals(true, ls.loginExists("Bobo"));
    }

    @Test
    public void testLoginExistsFalse() {
        LoginService ls = new LoginService(listArray);
        assertEquals(false, ls.loginExists("Bibi"));
    }

    @Test
    public void testAddLogin() {
        LoginService ls = new LoginService(listArray);
        ls.addLogin("Bibi");
        assertEquals(true, ls.loginExists("Bibi"));
    }

    @Test
    public void testFindAllLoginsStartingWith() {
        LoginService ls = new LoginService(listArray);
        ArrayList<String> res = new ArrayList<>();
        res.add("SuperPierre");
        assertEquals(res,ls.findAllLoginsStartingWith("Su"));

    }

    @Test
    public void testFindAllLogins() {
        LoginService ls = new LoginService(listArray);
        assertEquals(logins,ls.findAllLogins());
    }
}