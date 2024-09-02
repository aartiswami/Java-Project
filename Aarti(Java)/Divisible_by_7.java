import java.util.*;

public class Divisible_by_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int Num = sc.nextInt();

        if (Num % 7 == 0) {
            System.out.println(+Num + " is Divisible by 7");
        } else {
            System.out.println(+Num + " is Not Divisible by 7");
        }
    }
}
