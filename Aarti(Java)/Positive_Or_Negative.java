import java.util.*;

public class Positive_Or_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int Num = sc.nextInt();

        if (Num >= 0) {
            System.out.println(+Num + " is Positive");
        } else {
            System.out.println(+Num + " is Negative");
        }

    }
}
