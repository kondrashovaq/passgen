package org.ekondrashova.passgen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = PasswordGenerator.generate(scanner.nextInt());
        System.out.println(password);
    }
}
