public class DecimalToHexadecimal {
    public static void main(String[] args) {
        int decimalNumber = 254; // You can change this value to test other numbers
        String hexadecimalNumber = convertDecimalToHex(decimalNumber);
        System.out.println("The hexadecimal representation of " + decimalNumber + " is " + hexadecimalNumber);
    }

    public static String convertDecimalToHex(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder hexString = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 16;
            hexString.append(convertToHexChar(remainder));
            decimal = decimal / 16;
        }

        return hexString.reverse().toString();
    }

    private static char convertToHexChar(int value) {
        if (value < 10) {
            return (char) (value + '0');
        } else {
            return (char) (value - 10 + 'A');
        }
    }
}
