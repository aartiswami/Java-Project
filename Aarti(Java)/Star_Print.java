import java.util.Scanner;

public class Star_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int Num = sc.nextInt();

        for(int i= 1; i<=Num; i++){
            System.out.println(" * ");
        }
    }
}
