import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class perfectNumberChecker {

    // Method to find the proper divisors of a number
    public static List<Integer> findDivisors(int num) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                divisors.add(i);
               
            }
        }
        return divisors;
    }

    // Method to check if a number is perfect
    public static boolean isPerfect(int num) {
        List<Integer> divisors = findDivisors(num);
        int sum = 0;
        for (int divisor : divisors) {
            sum += divisor;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPerfect(number)) {
            System.out.println(number + " is a perfect number.");
            System.out.println("Divisors of " + number + " are: " + findDivisors(number));
        } else {
            System.out.println(number + " is not a perfect number.");
        }
        scanner.close();
    }
}
