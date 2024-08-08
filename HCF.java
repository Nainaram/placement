public class HCF {
    public static int hcfval(int a, int b){
        // ensures that a is always greater than other.
        if(b > a){
            int temp = a;
            a = b;
            b = temp;
        }
        while( b!=0){
            // using the eucledain formula
            int remainder = a%b;
            a = b;
            b = remainder;
        }
        return a;
    }
    public static void main(String[] args) {
        int a = 12;
        int b  = 18;
        System.out.println("Highest common Factor of "+ a + " and "+ b + " is "+ hcfval(a,b));

    }
}
