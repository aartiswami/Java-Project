package Array;

import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {
        int a[] = new int[5];
        int temp;

        Scanner sc = new Scanner(System.in);
        // input
        for (int i = 0; i < a.length; i++) {
            System.out.print("\n Enter Elements " + i + " : ");
            a[i] = sc.nextInt();
        }
        // condition
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("\n First Smallest element : " + a[0]);

        System.out.println("\n Second Smallest element : " + a[1]);

        System.out.println("\n Third Smallest element : " + a[2]);

    }
}
