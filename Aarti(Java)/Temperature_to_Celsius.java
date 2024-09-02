import java.util.*;

public class Temperature_to_Celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperature : ");
        double Fahrenheit = sc.nextDouble();

        System.out.println("Temperature in Celsius : " + ((Fahrenheit - 32) * (5 / 9)) + "\\u00B0C");
    }
}
