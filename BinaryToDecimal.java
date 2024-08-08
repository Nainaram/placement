import java.util.*;
public class BinaryToDecimal {
    public static int BTD(String str){
        int decimal = 0;
        int base = 1; // 2^0 == 1
        for(int i = str.length()-1; i>=0; i--){
            char  digit = str.charAt(i);
            if(digit == '1'){
                decimal +=base;
        }
        base*=2;
    }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        
            System.out.println("ENTER THE BINARY VALUES ONLY:");
            String  binary = sc.nextLine();
            if(!binary.matches("[01]+")){
                System.out.println("invalid number as a binary.");
            }
            else{
                int decimal = BTD(binary);
                System.out.println(decimal);
            }
            
    
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
       finally{
        sc.close();
       }
    }   
}
