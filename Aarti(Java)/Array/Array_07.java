package Array;

import java.util.Scanner;

public class Array_07 {
    public static void main(String[] args) {
        int i = 0;
        int Num[] = new int[5];
        Scanner sc = new Scanner(System.in);

        // Displaying Null Array
        for (i = 0; i < 5; i++) {
            System.out.println("\n Values of Elements " + (i + 1) + " = " + Num[i] + ".");
        }

        // Accepting Array Elements From User
        for (i = 0; i < 5; i++) {
            System.err.print("\n Enter Values Of elements : " + (i + 101) + ":");
            Num[i] = sc.nextInt();
        }

        System.out.println("\n Entered Values in Array are =>\n");
        // Displaying Array with New Values
        for (i = 0; i < 5; i++) {
            System.out.print("\n Values of Elements : " + (i + 1) + "=" + Num[i] + ".");
        }
        System.out.println("\n\n Thanks");
    }
}
