public class PerfectNumber {
    public static void main(String[] args) {
        int num = 6;
            int sum = 0;
        for(int i = 1;i<=num/2;i++){
            System.out.println(num%i);
            if( num%i == 0)
            { sum +=i;
                    }
            }
            if (sum == num) {
                System.out.println("it is a perfect number.");
            }
            else{
                System.out.println("it is not a perfect number.");
            }
        
    }
}
