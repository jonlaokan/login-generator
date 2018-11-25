package geco;

import java.security.SecureRandom;
import java.lang.StringBuilder;

public class PasswordGeneration {

    static final int LEN = 8;
    static SecureRandom rnd = new SecureRandom();
    static final String alphanum =
            "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";


    /**
     * Create a Random String which may contain :
     *  - numbers : 0 to 9
     *  - lowercase letters : a-z
     *  - uppercase letters : A-Z
     *
     * @return a random LEN character String
     */
    public String getRandomPassword() {
        StringBuilder sb = new StringBuilder(LEN);

        for (int i = 0; i < LEN; i++)
            sb.append(alphanum.charAt(rnd.nextInt(alphanum.length())));

        return sb.toString();
    }
}
