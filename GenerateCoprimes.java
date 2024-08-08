import java.util.Scanner;
// THIS IS THE PROGRAM THAT GENERATE THE PAIRS OF THE GCD UPTO THE MAXVALUE ENTERED BY THE CLIENT.
public class GenerateCoprimes {
    public static int gcd(int a, int b){
        if (b == 0) {
            return a;
         }
         else{
            return gcd( b, a%b);
         }
    }
    public static boolean areCoprimes(int a , int b){
        return gcd(a,b)==1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to generate the coprime upto:");
         int Maxvalue = sc.nextInt();
         int count = 0;
        for(int i = 1 ; i<= Maxvalue;i++){
            for(int j = i+1; j<= Maxvalue;j++){
                if(areCoprimes(i,j)){
                    System.out.println("("+i+"," +j+")");
                    count++;
                }
            }
        }
             System.out.println(count);
        sc.close();
    }
}
