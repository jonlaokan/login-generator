package geco;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {

    @Test
    public void testGetRandomPassword() {
        PasswordGeneration pg = new PasswordGeneration();
        String firstPass = pg.getRandomPassword();
        assertNotEquals(firstPass,pg.getRandomPassword());
    }
}