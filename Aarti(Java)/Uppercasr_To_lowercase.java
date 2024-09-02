import java.util.Scanner;

public class Uppercasr_To_lowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character : ");
        char ch = sc.next().charAt(0);
        
        if(ch==Character.toLowerCase(ch)){
            System.out.println(Character.toUpperCase(ch));
        }
        else{
            System.out.println(Character.toLowerCase(ch));
        }


    }
}
