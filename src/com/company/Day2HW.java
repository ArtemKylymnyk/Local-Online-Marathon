package com.company;

import java.util.Scanner;

public class Day2HW {
    public static void main(String[] args) {
/*

        // Task 1. Прочитать строку S1. Прочитать строку S2. Прочитать строку S3. Вывести на экран сумму длин всех введенных строк и каждой по отдельности
        System.out.println("Enter 3 strings");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        int sum = s1.length()+s2.length()+s3.length();
        System.out.println("Total length of 3 strings: "+sum+ " symbols");
        System.out.println("String 1 length: "+ s1.length());
        System.out.println("String 2 length: "+ s2.length());
        System.out.println("String 3 length: "+ s3.length());
*/
/*

        // Task 2. Написать программу, которая считывает 5-и значное число с клавиатуры и выводит цифры из которого оно состоит. Например: считывается число "54698". Выводится: 5 4 6 9 8.
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 5-digit number:");
            String line = sc.nextLine();

            if (line.isEmpty())
                break;

            if (line.length() == 5) {
                String lineMod = line.charAt(0) + " ";
                lineMod = lineMod + line.charAt(1) + " ";
                lineMod = lineMod + line.charAt(2) + " ";
                lineMod = lineMod + line.charAt(3) + " ";
                lineMod = lineMod + line.charAt(4);
                System.out.println("Your number is " + lineMod);
                break;
            } else {
                System.out.println("Incorrect length");
            }

        }
*/

/*
        // Task 2. Написать программу, которая считывает 5-и значное число с клавиатуры и выводит цифры из которого оно состоит. Например: считывается число "54698". Выводится: 5 4 6 9 8.
        // Ver 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5-digit number:");
        String line = sc.nextLine();

        if (line.length() != 5) {
            System.out.println("Make sure you enter 5-digit number");
            return;
        }

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            System.out.println(c);
        }
 */

/*

        // Task 3. Написать программу, которая считает 4 числа c клавиатуры и выведет на экран самое большее из них. И самое меньшее :)
        // Форматирование сжато, что бы поместить на скриншот
        // Ver 1
        System.out.println("Enter 4 numbers");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();         int n2 = sc.nextInt();         int n3 = sc.nextInt();         int n4 = sc.nextInt();

        int max = n1;         int min = n1;
        //search for the maximum value
        if (max < n2) {max = n2;}
        if (max < n3) {max = n3;}
        if (max < n4) {max = n4;}
        // Search for the minimum value
        if (min > n2) {min = n2;}
        if (min > n3) {min = n3;}
        if (min > n4) {min = n4;}
        System.out.println("Maximum value is: " + max);
        System.out.println("Minimum value is: " + min);

*/
        /*
        // Ver 2
        System.out.println("Enter 4 numbers:");
        Scanner sc = new Scanner(System.in);

        int n = 4;
        int x;
        int y;
        int max = 0;
        int min = Integer.MAX_VALUE;

        while (n > 0) {
            x = sc.nextInt();
            y = x;
            if (x > max) max = x;
            if (y < min) min = y;
            n--;
        }
        System.out.println("Maximum value is:" + max);
        System.out.println("Minimum value is:" + min);
        //System.out.println(Integer.MAX_VALUE+" "+Integer.MIN_VALUE);
         */


      //Task 5. ver 1
        // Треугольник существует только тогда, когда сумма длин любых двух его сторон больше третьей.
        // Пользователь вводит a, b, c – длины сторон предполагаемого треугольника.
        // Напишите программу которая укажет существует такой треугольник или нет.
        System.out.println("Enter 3 sides of the triangle: a, b and c");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a+b<=c)
            System.out.println("Invalid triangle");
        else if (a+c<=b)
            System.out.println("Invalid triangle");
        else if (b+c<=a)
            System.out.println("Invalid triangle");
        else
            System.out.println("Valid triangle");

/*
        //Task 5. ver 2
        // Треугольник существует только тогда, когда сумма длин любых двух его сторон больше третьей.
        // Пользователь вводит a, b, c – длины сторон предполагаемого треугольника.
        // Напишите программу которая укажет существует такой треугольник или нет.
        System.out.println("Enter 3 sides of the triangle: a, b and c");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("Invalid triangle");
        }
        */

    }
}
