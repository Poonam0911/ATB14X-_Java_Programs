package IsElseTask24;

import java.util.Scanner;

public class FindPersonAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age<= 12)
            System.out.println("Person is a Child");
        else if (age <=19)
        {
            System.out.println("Person is a Teenager");
        }
        else if (age<=59)
        {
            System.out.println("Person is a Adult");
        }
        else if (age<=100)
        {
            System.out.println("Person is a Senior Citizon");
        }
        else
            System.out.println("Please enter the integer");

    }
}
