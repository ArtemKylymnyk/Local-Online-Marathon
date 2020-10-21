package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

/*
        //Ver 1. Getting names of each users separately and greeting each user separately
        System.out.println("Bellow is the short quiz");
        System.out.println();
        System.out.println("=====================================");

        Scanner sc = new Scanner(System.in);
        //User 1
        System.out.println("User1 what's your name?");
        String user1Name = sc.nextLine();
        System.out.println("-------------------------------------");
        //User 2
        System.out.println("User2 what's your name?");
        String user2Name = sc.nextLine();
        System.out.println("-------------------------------------");
        //User 3
        System.out.println("User3 what's your name?");
        String user3Name = sc.nextLine();
        System.out.println("=====================================");
        //Greeting each user separately
        System.out.println("Hi " + user1Name + "! Pleased to meet you!");
        System.out.println("Hi " + user2Name + "! Pleased to meet you!");
        System.out.println("Hi " + user3Name + "! Pleased to meet you!");
        sc.close();
        */
        //Ver 2. Getting names of each users separately and greeting all users together
        System.out.println("Bellow is the short quiz");
        System.out.println();
        System.out.println("=====================================");

        Scanner sc = new Scanner(System.in);
        //User 1
        System.out.println("User1 what's your name?");
        String userName = sc.nextLine();
        System.out.println("-------------------------------------");
        //User 2
        System.out.println("User2 what's your name?");
        userName = userName + ", " +sc.nextLine();
        System.out.println("-------------------------------------");
        //User 3
        System.out.println("User3 what's your name?");
        userName = userName + " and " +sc.nextLine();
        System.out.println("=====================================");
        //Greeting each user separately
        System.out.println("Hi " + userName + "! Pleased to meet you!");

        sc.close();
    }
}
