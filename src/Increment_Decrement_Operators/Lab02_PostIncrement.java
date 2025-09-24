package Increment_Decrement_Operators;

public class Lab02_PostIncrement {
    public static void main(String[] args) {
        int a =20;
        int b = a++;
        System.out.println(a);
        System.out.println(b);

        // POST increment  = Print first and then increase.
        // a++ ->  a = a+1 , increment by 1
        //  Exp and Result Table
        // Line No  | a | Result b
        // 5       |  20 |  NA
        // 6      |  21 | 20
        // 7   | 21 - print | 20
        // 8   | 21 | 20 - print
    }
}
