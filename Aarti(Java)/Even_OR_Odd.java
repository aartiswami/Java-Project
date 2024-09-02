import java.util.*;
public class Even_OR_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int Num= sc.nextInt();

        if (Num%2==0) {
            System.err.println(+Num +" is Even");
        }
        else{
            System.err.println(+Num +" is Odd");
        }
    }
}
