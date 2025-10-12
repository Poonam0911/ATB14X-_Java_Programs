package StringBuilder_StringBuffer;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you String");
        String S1= sc.next();
        char[] charArr = S1.toCharArray();

        for(int i=charArr.length-1 ;i>=0 ;i--)
        {
            System.out.print(charArr[i]);
        }
//         /

    }
}
