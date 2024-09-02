import java.util.*;
public class Reverse_Table 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Table Number :");
        int Num = sc.nextInt();

        for(int i=10; i>=1;i--)
        {
            System.out.println(+Num +" * " +i +" = " +(Num*i));
        }

        
    }   
}
