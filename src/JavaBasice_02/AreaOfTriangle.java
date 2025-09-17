package JavaBasice_02;

public class AreaOfTriangle {


    double CalculateArea(double height, double base)
    {
        return height*base/2;
    }

    public static void main(String[] args) {
        double height =15;
        double base =16.5;
        AreaOfTriangle obj = new AreaOfTriangle();
        System.out.printf("Area of Triangle = %f",obj.CalculateArea(height,base));
    }
}
