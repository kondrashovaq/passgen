package org.ekondrashova.passgen;

import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String charSetLower = "abcdefghijklmnopqrstuvwxyz";
    private static final String charSetUpper = charSetLower.toUpperCase();
    private static final String charSetNumber = "0123456789";

    private static final String charSet = charSetLower + charSetUpper + charSetNumber;
    private static final SecureRandom secureRandom = new SecureRandom();

    public static String generate(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomCharIndex = secureRandom.nextInt(charSet.length());
            char randomChar = charSet.charAt(randomCharIndex);
            sb.append(randomChar);
        }
        return sb.toString();
    }
}


