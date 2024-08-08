// this is the code to find if a number is prime or composite

import java.util.Scanner;

public class prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        System.out.println("Check your number :");
        int number = sc.nextInt();
        if( number== 1 ){
            System.out.println(" your number is neither prime nor composite.");
        }
        else if ( number%1==0 && number%number ==0){
            System.out.println("Your number is prime " + number);
        }
        else{
            System.out.println(" your number is  a composite number");
        }
       
        sc.close();
    }
}