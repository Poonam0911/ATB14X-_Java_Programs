package TypeCasting;

public class Lab01_TypeCasting {
    public static void main(String[] args) {
        byte b= 10;
      //  int a = b;      //valid syntax-implicit casting -> widening -> automatically done
        int a = (int) b;  //Explicit casting ->widening-> not required
        System.out.println(b);
        long mobile= 98765432101l;
       // short p = mobile; // implicit narrowing
        short p = (short)mobile; // explicit narrowing
        System.out.println(p);
    }
}
