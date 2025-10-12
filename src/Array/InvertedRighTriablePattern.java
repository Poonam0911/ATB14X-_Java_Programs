package Array;

import java.util.Scanner;

public class InvertedRighTriablePattern {
    public static void main(String[] args) {
        System.out.println("Enter size of 2D array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int Arr[][] = new int [size][size];
        for(int i = Arr.length-1 ;i>=0 ;i--)
        {
            for(int j = 0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
