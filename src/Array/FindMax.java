package Array;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the arr");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array element");

        for (int element = 0; element < size; element++) {
            arr[element] = sc.nextInt();
        }

       int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("maximum number in array =  " + max);
        sc.close();
    }
}



