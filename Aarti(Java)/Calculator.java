import java.util.*;
public class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Num1=0 ,Num2=0;
        int result, choice;

        

        while (true) 
        {
   
            System.out.println(("==========================Calculator=========================="));
            System.out.println(("                           Choices:                            "));
            System.out.println("================================================================");
            System.out.println(("1.Addition"));
            System.out.println(("2.Subtraction"));
            System.out.println(("3.Multiplication"));
            System.out.println(("4.Division"));
            System.out.println(("5.Modulo"));
            System.out.println(("6.Exit"));

        

            System.out.println("Select the choice:");
            choice=sc.nextInt();

        if((choice >0 ) && (choice < 6))
        {

            System.out.println("Enter First number");
            Num1 =sc.nextInt();
            System.out.println("Enter Second number");
            Num2 =sc.nextInt();
            
        }

        switch(choice)
        {
            case 1 :
            result = Num1+ Num2;
            System.out.println("Addition of "+Num1 +" and " +Num2 +" = "+result);
            break;

            case 2 :
            result = Num1- Num2;
            System.out.println("Substraction of "+Num1 +" and" +Num2 +" = "+result);
            break;

            case 3 :
            result = Num1* Num2;
            System.out.println("Multiplication of "+Num1 +" and" +Num2 +" = "+result);
            break;

            case 4 :
            result = Num1 /Num2;
            System.out.println("Division of "+Num1 +" and" +Num2 +" = "+result);
            break;

            case 5 :
            result = Num1 % Num2;
            System.out.println("Module of "+Num1 +" and " +Num2 +" = "+result);
            break;

            case 6 : 
            break;

            default :
            System.out.println("Invalid Option: ");
                
        }
        if(choice==6)
        {
            break;

        }  
        
      }
        System.out.println("Thanks for using this calculator !");
    }

    
}
