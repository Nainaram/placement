import java.util.Scanner;
// this is the code that given number pair is coprime or not
public class Coprime {
    public static int gcd(int a,int b){
        if( b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
    public  static boolean checkCoprime(int a , int b){
        return gcd(a,b) ==1;
    }
    public static void main(String[] args) {
        Scanner SC = new Scanner (System.in);
        System.out.println(" ENTER TWO NUMBERS TO FIND THE GCD:");
        int a = SC.nextInt();
        int b = SC.nextInt();
        System.out.println(checkCoprime(a,b));

        SC.close();
    }
}
