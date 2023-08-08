public class FirstHalfSummationPerfect {
    public static int firstHalfDigits(int n){
        int temp =n;
        int count=0;
        while(temp>0){
            count++;
            temp/=10;
        }
        int expo=1;
        for(int i=1;i<=count/2;i++){
            expo = expo*10;

        }
        return n/expo;
    }
    public static int sum(int n){
        int sum =0;
        while(n>0){
            int digit = n%10;
            sum+=digit;
            n/=10;
        }
        return sum;
    }
    public static boolean perfectNumberCheck(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            return true;
        }
        return false;
    }
    
    
    public static void main(String[] args) {
        int n=231567;
        int k=sum(firstHalfDigits(n));
        if(perfectNumberCheck(k)){
            System.out.println("the summation of first half of given number is perfect number");
        }
    }
}
