package com.company;

import java.util.Scanner;

public class Day3HW {
    public static void main(String[] arg) {

/*

        // Task 3. Написать простой калькулятор:
        //а) пользователь вводит число X
        //б) пользователь вводит число Y
        //в) пользователь вводит действие, которое нужно выполнить с числами (+, -, ...)
        //г) программа выводит результат и переходит к шагу (а)
        //д) чтобы программа завершила свою работу нужно ввести пустое значение на шаге (а).
        Scanner sc = new Scanner(System.in);
        Double x;
        while (true) {
            System.out.println("Please enter X:");
            String xCheck = sc.next();
            if (xCheck.isEmpty()) return;
                else { x = Double.parseDouble(xCheck);}

            System.out.println("Please enter Y:");
            Double y = sc.nextDouble();

            System.out.println("Enter math operation (+, -, *, /, %):");
            String opr = sc.next(); //why .nextLine() does not work? note: .next() works fine in this case

            if ("+".equals(opr)) {
                System.out.println(x + opr + y + "=" + (x + y));
            } else if ("-".equals(opr)) {
                System.out.println(x + opr + y + "=" + (x - y));
            } else if ("*".equals(opr)) {
                System.out.println(x + opr + y + "=" + (x * y));
            } else if ("/".equals(opr)) {
                System.out.println(x + opr + y + "=" + (x / y));
            } else if ("%".equals(opr)) {
                System.out.println(x + opr + y + "=" + (x % y));
            }
            System.out.println("-----------------\r\n");

        }
*/

        int i;
        for (i = 1; i < 100; i++) {
            if (i % 3 == 0) System.out.println(i);
        }

    }
}
