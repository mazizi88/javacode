import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Please enter radius of circle:");
        Scanner sc = new Scanner(System.in);
        double radius =  sc.nextDouble();
        double area = calculateArea(radius);
        System.out.println("Area is: "+area);
    }
    static double calculateArea(double input)
    {
        double area =Math.PI * Math.pow(input,2);
        return area;
    }
}
