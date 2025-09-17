package JavaBasice_02;

public class PreAndPostOperator {
    public static void main(String[] args) {
        int a =13;

        /*First increase the value of a,then Assign to c and
        the current value will print for a */
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
        int c= 12;
        /*first assign same value to c,then do the increment in c
        and the current value of a will print*/
        int d= c++;
        System.out.println(c);
        System.out.println(d);

    }
}
