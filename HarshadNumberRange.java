import java.util.Scanner;

public class HarshadNumberRange {
    
    public static int sum(int n){
        int sum=0;
        while(n>0){
            int digit = n%10;
            sum+=digit;
            n=n/10;

        }
        return sum;
    }
    
    
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nth = sc.nextInt();
        int count =0;
        int n=1;
        while(true){
            if(n%sum(n)==0){
                count++;
            }
            if(count==nth){
                System.out.println(n);
                break;
            }
            n++;
        }
        
        
    }
}
