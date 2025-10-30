package IsElseTask24;

import java.util.Scanner;

public class ConvertDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int year = days/365;   // take Quotient
        int remainingDays = days % 365;   //take remainder
        //System.out.println(remainingDays);
        int months = remainingDays / 30;  // 1 month = 30 days
        int daysLeft = remainingDays % 30;
        System.out.println(daysLeft);
        System.out.println(days + " days = " + year + " years, "
                + months + " months, and "
                + daysLeft + " days.");
    }
}
