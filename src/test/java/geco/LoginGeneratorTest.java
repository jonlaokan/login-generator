package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    private LoginService loginService;
    private LoginGenerator loginGenerator;

    @Before
    public void setUp() {
        loginService = new LoginService(new String[]
                        {"JROL", "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
    }

    @Test
    public void testGenerateLoginForNomAndPrenom() {
        String res = "PDUR";
        loginGenerator = new LoginGenerator(loginService);
        assertEquals(res,loginGenerator.generateLoginForNomAndPrenom("Durand","Paul"));
    }

    @Test
    public void testGenerateLoginSuffixIncrementation() {
        String res = "JRAL2";
        loginGenerator = new LoginGenerator(loginService);
        assertEquals(res,loginGenerator.generateLoginForNomAndPrenom("Ralling","John"));
    }

    @Test
    public void testGenerateLoginForJohnRolling() {
        String res = "JROL1";
        loginGenerator = new LoginGenerator(loginService);
        assertEquals(res,loginGenerator.generateLoginForNomAndPrenom("Rolling","John"));
    }

    @Test
    public void testGenerateLoginForPaulDurand() {
        String res = "PDUR";
        loginGenerator = new LoginGenerator(loginService);
        assertEquals(res,loginGenerator.generateLoginForNomAndPrenom("Dùrand","Paul"));
    }

    @Test
    public void testGenerateLoginForPaulDu() {
        String res = "PDU";
        loginGenerator = new LoginGenerator(loginService);
        assertEquals(res,loginGenerator.generateLoginForNomAndPrenom("Du", "Paul"));
    }

    @Test
    public void testGenerateLoginForJonD() {
        String res = "JD";
        loginGenerator = new LoginGenerator(loginService);
        assertEquals(res,loginGenerator.generateLoginForNomAndPrenom("D", "Jon"));
    }
}