package LoopsInJava;

import java.util.Scanner;

public class PrintTableOf5 {
    public static void main(String[] args) {
        System.out.println("Print the multiplication table of 5");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int table =0;
        /*for(int i=1;i<=10;i++)
        {

           table= num*i;
           System.out.println(table);
        }*/
        int i=1;
        while(i<=10)
        {
            table = num*i;
            System.out.println(table);
            i++;
        }
    }
}
