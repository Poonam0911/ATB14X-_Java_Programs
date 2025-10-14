package IfElseProgram;

import java.util.Scanner;

public class VowelConsonantCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the letter");
       String input = sc.next();
       char c = input.charAt(0);
       if (c == 'A' || c=='a'||c == 'E' || c=='e'||c == 'I' || c=='i'||c == 'O' || c=='o'||c == 'U' || c=='u')
           System.out.println("Letter is vowel");
       else
           System.out.println("Letter is consonant");

    }
}
