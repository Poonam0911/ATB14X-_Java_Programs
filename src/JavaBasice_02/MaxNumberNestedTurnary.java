package JavaBasice_02;

public class MaxNumberNestedTurnary {
    public static void main(String[] args) {

        int n1= 300;
        int n2= 200;
        int n3= -700;
        int max= (n1>n2? (n1>n3?n1:n3):((n2>n3)? n2:n3));
        System.out.printf("Max is  %d",max);


    }
}
