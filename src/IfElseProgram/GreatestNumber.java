package IfElseProgram;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number to campare the greatest one");
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int N3 = sc.nextInt();

        if(N1 > N2 && N1 > N3)
        {
            System.out.println("N1 is greatest");
        } else if ((N2> N1 && N2> N3))
        {
            System.out.println("N2 is the greates");
        }
        else
            System.out.println("N3 is greates");

        {

        }
    }
}
