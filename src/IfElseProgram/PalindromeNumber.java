package IfElseProgram;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int number = sc.nextInt();

        int reverse=0, temp= number;

        while(temp > 0)
        {
            int remainder = temp%10;
            reverse = (reverse*10 + remainder);
            temp = temp/10;
        }

        if(reverse == number)
        {
            System.out.println("Number is Palindrome");
        }
        else
            System.out.println("Number is non Palindrome");
    }
}
