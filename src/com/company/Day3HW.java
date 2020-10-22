package com.company;

import java.util.Scanner;

public class Day3HW {
    public static void main(String[] arg) {

        // Task 3. Написать простой калькулятор:
        //а) пользователь вводит число X
        //б) пользователь вводит число Y
        //в) пользователь вводит действие, которое нужно выполнить с числами (+, -, ...)
        //г) программа выводит результат и переходит к шагу (а)
        //д) чтобы программа завершила свою работу нужно ввести пустое значение на шаге (а).
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter X: ");
            String sX = sc.nextLine();
            if (sX.isEmpty()) return;

            System.out.print("Please enter Y: ");
            String sY = sc.nextLine();

            System.out.print("Enter math operation (+, -, *, /, %): ");
            String sOpr = sc.nextLine();

            double x = Double.parseDouble(sX);
            double y = Double.parseDouble(sY);
            double res;

            if ("+".equals(sOpr)) {
                res = (x + y);
            } else if ("-".equals(sOpr)) {
                res = (x - y);
            } else if ("*".equals(sOpr)) {
                res = (x * y);
            } else if ("/".equals(sOpr)) {
                res = (x / y);
            } else if ("%".equals(sOpr)) {
                res = (x % y);
            } else {
                System.out.println("Unknown operation!"); break;
            }
            System.out.println(x + " " + sOpr + " " + y + " " + "= " + res);
            System.out.println("-----------------\r\n");

        }

/*

    // Task 2. Вывести на консоль числа от 1 до 100, которые делятся на 3 без остатка. Например: 3, 6, 9, 12...
        int i;
        for (i = 1; i < 100; i++) {
            if (i % 3 == 0) System.out.println(i);
        }
*/

    }
}
