public class FibanacciSumPrime {
    public static int sum(int n){
        int sum=0;
        while(n>0){
            int d = n%10;
            sum+=d;
            n/=10;
        }
       return sum;
    }
    public static boolean Palnidrome(int n){
        int rev =0;
        int temp = n;
        while(temp>0){
            int d = temp%10;
            rev= rev*10+d;
            temp/=10;
        }
        if(rev==n){
            return true;
        }
        return false;
    }
    
       
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int n3=0;
        while(n3<=100){    
            
            n1=n2;
            n2=n3;           
            n3=n1+n2;
           
        }
        int sum = sum(n2);
        if(Palnidrome(sum)){
            System.out.println("the sum of  digits of last fibbanaci number is palindrome number");
        }
        else{
            System.out.println("the sum of  digits of last fibbanaci number is not palindrome number");
        }
        
        
    }
        
}
