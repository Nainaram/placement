// this is the code to find the  missing number in the array
public class MissingNumber{
    public static int findMissing(int arr [] ,int n){
        int [] Hash = new int[n+1]; // Hash[] = [0,0,0,0,0,0];
        for(int i =0;i< n-1;i++){
            Hash[arr[i]]++; 
            
        }// Hash[] = [0,1,1,1,0,1];
        // finding the missing number
        for( int i = 1; i <=n-1;i++){
            if(Hash[i]==0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr [] = { 1,2,3,5};
        int n = 5;
        int result = findMissing(arr,n);
        System.out.println(result);
    }
}