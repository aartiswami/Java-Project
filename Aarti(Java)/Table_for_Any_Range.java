import java.util.Scanner;

public class Table_for_Any_Range {
    public static void main(String[] args) {
        int mult= 1;
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter Staring Point: ");
        int sp = sc.nextInt();

        System.err.print("Enter Ending Point: ");
        int Ep = sc.nextInt();

        for(int i= 1; i<=Ep; i++){
            mult = sp*i;
            System.out.println(sp +" * "+i +" = " +mult);
        }

    }
}
