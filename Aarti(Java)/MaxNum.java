import java.util.*;
public class MaxNum {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.err.println("Enter a num");
     int Num1 = sc.nextInt();
     int Num2 = sc.nextInt();

     if(Num1==Num2){
        System.err.println("Both numbers are same");
     }
     else if (Num1>Num2) {
            System.err.println(+Num1 +" is a Greater");        
     }
     else{
        System.err.println(+Num2 +" is a Greater");        
     }


  }  
}
