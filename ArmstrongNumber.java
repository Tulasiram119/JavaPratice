import java.util.Scanner;

public class ArmstrongNumber {
    public static int count(int n){
      int count=0;
      while(n>0){
        count++;
        n=n/10;
      }
      return count;  
    }
    public static int expo(int n,int count){
        int ex =1;
        for(int i=1;i<=count;i++){
            ex=ex*n;
        }
        return ex;
    }  
    public static boolean desariumCheck(int n){
        int temp =n;
        int sum=0;
        int count = count(n);
        while(temp>0){
            int digit = temp%10;
            sum+=expo(digit,count);
            temp/=10;
            count--;
            }
            if(sum==n){
                return true;
            }
            else{
                return false;
            }

    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nth = sc.nextInt();
        int n=1;
        int count =0;
        while(true){
            if(desariumCheck(n)){
                count++;
            }
            if(nth==count){
                System.out.println(n);
                break;
            }
            n++;
        }
                       
            
        
        
    }
}
