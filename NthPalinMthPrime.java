public class NthPalinMthPrime {
    public static boolean checkPalindrome(int n){
        int rev=0;
        int temp = n;
        while(temp>0){
            int d= temp%10;
            rev=rev*10+d;
            temp/=10;
        }
        if(rev==n){
            return true;
        }
        return false;
    }
    public static boolean checkPrime(int n){
        if(n==1||n==0){
            return false;
        }
        
        for(int i=2;i<n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        int nth = 2;
        int mth=1;
        int count1=0;
        int count2=0;
        int palin=0;
        int prime=0;
        for(int i=1;i<100;i++){
            if(checkPalindrome(i)){
                count1++;
            }
            if(count1==nth){
                palin=i;
                break;
            }
        }
        for(int i=1;i<100;i++){
            if(checkPrime(i)){
                count2++;
            }
            if(count2==mth){
                prime=i;
            }
        }
        if(prime==palin){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Both are not equal");
        }
    }
}
