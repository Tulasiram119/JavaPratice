public class PerfectNumber {
    public static boolean PerfectNumberCheck(int n){
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
        int nth =4;
        int count=0;
        for(int i=0;i<1000;i++){
            if(PerfectNumberCheck(i)){
                count++;
            }
            if(count==nth){
                System.out.println(i);
                return;
            }
        }
    }
}
