package org.ekondrashova.passgen;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPasswordGenerator {
    @Test
    public void testGeneratePasswordWithSpecifiedLength() {
        String password1 = PasswordGenerator.generate(5);
        String password2 = PasswordGenerator.generate(7);
        String password3 = PasswordGenerator.generate(10);

        assertAll(
                () -> assertEquals(5, password1.length()),
                () -> assertEquals(7, password2.length()),
                () -> assertEquals(10, password3.length())
        );
    }
}
