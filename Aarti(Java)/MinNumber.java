package Array;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        int Min = 0, i = 0;
        int a []= new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements\n ");

        for(i = 0; i < a.length; i++)
        {
            System.out.print("\n Enter number " + (i) +" : ");
            a[i]= sc.nextInt();
        }

        for(i = 0; i < a.length; i++)
        {
                if((i == 0) || (a[i] < Min) )
                {
                    Min = a[i];
                }
        }

            System.out.print("\n Maximum Number is : "+Min);
 }
}
