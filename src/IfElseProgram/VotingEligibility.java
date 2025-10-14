package IfElseProgram;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age");
        int Age = sc.nextInt();
        if (Age>=18)
            System.out.println("Person is eligible for Vote");
        else
            System.out.println("Person can't vote");
    }
}
