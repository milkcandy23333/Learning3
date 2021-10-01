package com.learning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("This is a Caesar encryption/decryption program");
            System.out.println("Press 1 to Encrypt or 2 to Decrypt");
            int Operator;
            String s;
            int p;
            Operator = scanner.nextInt();
            if (Operator == 1) {
                System.out.println("Step 1:Enter the string to encrypt.");
                s = scanner.next();
                System.out.println("Step 2:Enter the offset.");
                p = scanner.nextInt();

                CaesarEncryption X = new CaesarEncryption();
                s = X.Encrypt(s, p);

                System.out.println(s);
            }
            if (Operator == 2) {
                System.out.println("Step 1:Enter the string to decrypt.");
                s = scanner.next();
                System.out.println("Step 2:Enter the offset.");
                p = scanner.nextInt();

                CaesarEncryption X = new CaesarEncryption();
                s = X.Decrypt(s, p);
                System.out.println(s);
            }
        }
    }
}
