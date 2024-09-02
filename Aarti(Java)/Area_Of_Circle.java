import java.util.*;

public class Area_Of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double Area = pi * radius * radius;

        System.out.println("Area of Circle " + Area);

    }
}
