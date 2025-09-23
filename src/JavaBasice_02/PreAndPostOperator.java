package JavaBasice_02;

public class PreAndPostOperator {
    public static void main(String[] args) {
        int a =13;

        /*First increase the value of a,then Assign to b and
        the current value will print for a */
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        int c= 12;
        /*first assign same value to c,then do the increment in c
        and the current value of c will print*/
        int d= c++;
        System.out.println(c);
        System.out.println(d);

        int p = 13;
        System.out.println(p++ + p); // (p is 13 then increment by 1) + (latest value of P)=27
        System.out.println(p);// print the current value of p = 14
        int q =15;
        System.out.println(++q + q);//16+16=32
        System.out.println(q); //16

    }
}
