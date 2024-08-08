public class Lcm {
    public static int gcd(int a, int b){
        while (b!=0){
            int remainder = a%b;
            a = b ;
            b = remainder;
        }
        return a;
    }
    public static int lcmval(int a , int b){
        return Math.abs(a*b)/gcd(a,b);
    }
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        System.out.println(" Lowest common multiple of " + a +"," + b+ " is:" + lcmval(a,b));
    }
}
