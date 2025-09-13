package JavaBasice_02;

public class ReverseTriangle {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<4;i++)
        {
            for(int j=n ;j>i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
