package com.company;

public class Day3 {
    public static void main(String[] arg) {
        // Loops
        // "While" loop
        System.out.println("'While' loop:");
        int n = 5;
        while (n > 0) {
            System.out.println(n);
            n -= 1;
        }

        // "Do ... While" loop
        System.out.println("'Do .. While' loop:");
        int m = 5;
        do {
            System.out.println(m);
            m -= 1;
        } while (m > 0);

        // "For" loop
        System.out.println("'For' loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


    }
}
