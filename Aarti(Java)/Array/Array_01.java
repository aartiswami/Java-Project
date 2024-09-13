package Array;

public class Array_01 {
    public static void main(String[] args) {
        int numbers[] = { 10, 20, 30, 40, 50 };

        System.out.println("Array length: " + numbers.length + "\n");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + " : " + numbers[i]);
        }
    }
}
