import java.util.*;

public class Area_Of_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height: ");
        double height = sc.nextDouble();

        System.out.println("Enter Width: ");
        double width = sc.nextDouble();

        double Area = height * width;

        System.out.println("Area of Rectangle " + Area);
    }
}
