import java.util.*;
public class Max_From_Three 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter 1st Number:");
        int Num1=sc.nextInt();   
 
        System.out.println("Enter 2nd Number:");
        int Num2=sc.nextInt();

        System.out.println("Enter 3rd Number:");
        int Num3=sc.nextInt();

        if((Num1>Num2)&& (Num1>Num3))
        {
            System.out.println(+Num1 +" is Greater");
        }
        else if((Num2>Num1)&& (Num2>Num3))
        {
            System.out.println(+Num2 +" is Greater");
        }
        else
        {
            System.out.println(+Num3 +" is Greater");
        }
    }    
}
