import java.util.*;
public class Percentage {
    public static void main(String[] args) {
       
    Scanner sc = new Scanner(System.in);

    System.out.print("Marks in Subject 1: ");
    int m1 = sc.nextInt();
    
    
    System.out.print("Marks in Subject 2: ");
    int m2 = sc.nextInt();

    
    System.out.print("Marks in Subject 3: ");
    int m3 = sc.nextInt();

    int Total = m1+m2+m3;

    double Percentage = (double)Total/3;

    System.out.println("Total Marks: "+Total +" Percentage : "+Percentage +"%");

    }
}
