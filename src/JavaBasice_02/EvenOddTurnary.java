package JavaBasice_02;

public class EvenOddTurnary {
    public static void main(String[] args) {
        int num = 13;
        String result = (num % 2==0 ? "Number is even":"Number is odd");
        System.out.println(result);
    }
}
