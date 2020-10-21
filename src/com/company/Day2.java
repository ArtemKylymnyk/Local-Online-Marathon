package com.company;

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
/*
        // Lesson 2.1. Numbers
        byte b1 = 100; // 8 bit = 1 byte; [-128; 127]
        short s1 = 1000;
        int i1 = 10000;
        long l1 = 1000000;

        float f1 = 1.2f; // f should be added
        double p1 = 3.4; // more frequently used and more accurate

        System.out.println(p1);
*/

/*
        // Lesson 2.2. Numbers 2
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter X:");
        int x = sc.nextInt();

        System.out.println("Enter Y:");
        int y = sc.nextInt();

        int r1 = x + y;
        x += y; // x = x+y;

        System.out.println(r1);

        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y); //modular division
 */

/*
        // Lesson 2.3. Text
        Scanner sc = new Scanner(System.in);

        String s1 = "Hello";
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        System.out.println(s1 + s2 +s3);
        String sr = s1+s2+s3;
        System.out.println("Previous line length is:" + sr.length());

        String sub = sr.substring(0,s1.length()-1);
        System.out.println(sub);

        char a = 'A';
        char b = s1.charAt(s1.length()-1); // taking the char placed at (x) position of the string

        System.out.println(b);

 */


        // Lesson 2.4. Boolean
/*
        Scanner sc = new Scanner(System.in);
        int x = 10;
        int y=5;
        boolean b = x<=y;
        System.out.println(b);

*/
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        if (age >= 18) {
            System.out.println("Access granted!");
        } else {
            System.out.println("Access denied!");
        }
*/
        // Lesson 2.5. Loops
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("* Enter command from available (/proc, /os, /user):");
            String cmd = sc.nextLine();

            if (cmd.isEmpty())
                break;

            if ("/proc".equals(cmd)) {
                System.out.println("Number of processors: " + Runtime.getRuntime().availableProcessors());
                System.out.println("Free memory: " + Runtime.getRuntime().freeMemory() + " Bytes"+ "\r\n");

            } else if ("/os".equals(cmd)) {
                System.out.println("Current operating system is " + System.getProperty("os.name")+ "\r\n");
            } else if ("/user".equals(cmd)) {
                System.out.println("Current user: " + System.getProperty("user.name")+ "\r\n");
            } else {
                System.out.println("Unknown command"+ "\r\n");
            }
        }

    }
}
