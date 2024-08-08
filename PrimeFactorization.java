public class PrimeFactorization {

    public static void primeFactorize(int number) {
        // Handle the smallest prime number, which is 2
        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number /= 2;
        }

        // Check for odd factors from 3 onward
        for (int i = 3; i * i <= number; i += 2) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }

        // If the remaining number is a prime number greater than 2
        if (number > 2) {
            System.out.print(number);
        }
    }

    public static void main(String[] args) {
        int number = 18;  // Change this number to test other values
        System.out.print("Prime factors of " + number + " are: ");
        primeFactorize(number);
    }
}
