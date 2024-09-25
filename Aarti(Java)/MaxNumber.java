package Array;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        int a []= new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements\n ");

        for(int i=0;i<a.length;i++)
        {
            System.out.print("\n Enter number " + (i) +" : ");
            a[i]= sc.nextInt();
        }
      int max = a[0];
         for(int i=0;i<a.length;i++)
        {
                if(a[i]>max){
                    max = a[i];
                }
        }

            System.out.print("\n Maximum Number is : "+max);
     
    }
}
