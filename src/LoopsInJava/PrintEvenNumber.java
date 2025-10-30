package LoopsInJava;

public class PrintEvenNumber {
    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 20:");
/*        for(int i =1;i<=20;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }

        }*/
        int i=1;
        while(i<=20)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
