import java.util.*;;

public class Less_10_print_Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int word = sc.nextInt();

        if (word < 10) {
            System.out.println("Hello");
        } else {
            System.out.println("World");
        }
    }
}
