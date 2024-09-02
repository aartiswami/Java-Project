import java.util.Scanner;

public class vowels_Or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);
       
       if(ch == 'a' || ch =='e' || ch== 'i' || ch == 'o'|| ch=='u'){
        System.out.println(ch +" is Vowel");
       }
       else{
        System.out.println(ch +" is Not Vowel");
       }


    }
}
