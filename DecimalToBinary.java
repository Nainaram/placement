import java.util.*;

public class DecimalToBinary {
    // Method to convert a decimal number to its binary representation
    public static String DTB(int num) {
        // Base case: if the number is zero, return "0"
        if (num == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        // Convert the number to binary
        while (num > 0) {
            binary.insert(0, num % 2);
            num /= 2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the value to convert:");
            int num = sc.nextInt();
            System.out.println("Binary conversion of the given number: " + DTB(num));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            sc.close();
        }
    }
}
