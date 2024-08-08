import java.util.*;

public class DecimalToOctal {
    // Method to convert a decimal number to its octal representation
    public static String DTB(int num) {
        // Base case: if the number is zero, return "0"
        if (num == 0) {
            return "0";
        }
        StringBuilder octal = new StringBuilder();
        // Convert the number to octal
        while (num > 0) {
            octal.insert(0, num % 8);
            num /= 8;
        }
        return octal.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the value to convert:");
            int num = sc.nextInt();
            System.out.println("octal conversion of the given number: " + DTB(num));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            sc.close();
        }
    }
}
