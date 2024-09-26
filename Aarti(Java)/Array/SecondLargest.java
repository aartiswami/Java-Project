package Array;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        int temp;
        int a[] = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("\n Enter elements " + i + " : ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        System.out.println("\n First largest : " + a[0]);

        System.out.println("\n second largest : " + a[1]);

        System.out.println("\n Third largest : " + a[2]);

    }
}
