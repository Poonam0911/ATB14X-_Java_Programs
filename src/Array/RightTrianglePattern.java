package Array;

import java.util.Scanner;

public class RightTrianglePattern {
    public static void main(String[] args) {
        System.out.println("Enter the Size of 2D array");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Arr[][] = new int[N][N];
        //System.out.println("Enter the pattern");
        for(int i =0;i<Arr.length;i++)
        {
            for(int j=0; j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }


}
