package Increment_Decrement_Operators;

public class Lab03_PrePostMix {
    public static void main(String[] args) {
        int a =10;
        System.out.println(a++ + ++a);
        //A-> a++
        //B-> ++a
        //A+B ->10+(11+1)->22
        System.out.println(a);//12
    }
}
