import java.util.*;

public class Sum_10_num {

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 Numbers: ");
        for(int i = 1; i<=10;i++){
        int Num = sc.nextInt();
        sum = sum +Num;
        }

        System.out.println("Addition of 10 Num is :"+sum);
       

        
    }
}