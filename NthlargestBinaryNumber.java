public class NthlargestBinaryNumber {
    public static int decimalToBinary(int n){
        
        int count =0;
        int sum=0;
        while(n>0){
            int d = n%2;
            int exp =1;
            for(int i=1;i<=count;i++){
                exp=exp*10;
            }
            sum=sum+exp*d;
            n/=2;
            count++;
        }
        return sum;
    }
    public static int binaryToDecimal(int n){
        
        int count =0;
        int sum=0;
        while(n>0){
            int d = n%10;
            int exp =1;
            for(int i=1;i<=count;i++){
                exp=exp*2;
            }
            sum=sum+exp*d;
            n/=10;
            count++;
        }
        return sum;
    }

    
    
    
    
    
    public static void main(String[] args) {
        int n=2334;
        int binary=decimalToBinary(n);
        int rev =0;
        while(binary>0){
            int d= binary%10;
            rev = rev*10+d;
            binary/=10;
        }
        System.out.println(binaryToDecimal(rev));
    }
}
