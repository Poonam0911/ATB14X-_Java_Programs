package IfCondition;

import java.util.Scanner;

public class Lab02_IfScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if(age > 18)
            System.out.println("You can go to travel");
        else
            System.out.println("You can't travel");

    }
}
