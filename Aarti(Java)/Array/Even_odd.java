package Array;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("\nEnter Elements: " + i + " : ");
            a[i] = sc.nextInt();
        }

        System.out.println("\nEven number: ");

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }

        System.out.println("\nOdd number: ");

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }
    }
}
