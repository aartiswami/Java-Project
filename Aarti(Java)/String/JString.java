package String;

public class JString {
    public static void main(String[] args) {

        String str = "Hello, World!";
        // length
        System.out.println("\n Length: " + str.length());
        // lowercase And Uppercase
        System.out.println("\n Uppercase: " + str.toUpperCase());
        System.out.println("\n Lowercase: " + str.toLowerCase());
        // Replacing Subtring
        String newStr = str.replace("World", "Java");
        System.out.println("\n Replaced : " + newStr);
        // check if string contains a substring

        System.out.println("\n Contains 'World': " + str.contains("World"));
        // Split string
        String[] parts = str.split(", ");
        for (String part : parts) {
            System.out.println("\n part: " + part);
        }

    }
}
