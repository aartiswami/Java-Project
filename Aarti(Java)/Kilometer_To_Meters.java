import java.util.*;

public class Kilometer_To_Meters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Kilometer: ");
        double Km = sc.nextDouble();
        System.out.println("Distance " + Km + " km");

        System.out.println("Distance in meters : " + (int) (Km * 1000) + " meters");

    }
}
