public class SumNonFiabStrong {
    
   public static int fact(int n){
        int fac=1;
        for(int i=1;i<=n;i++){
            fac=fac*i;
        }
        return fac;
   } 
   public static boolean strongnumbercheck(int n){
        int sum =0;
        int temp =n;
        while(n>0){
            int d= n%10;
            sum+=fact(d);
            n/=10;
        }
        if(sum==temp){
            return true;
        }
        return false;
        
   }
    
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=1;
        int sum=0;
        for(int i=1;i<10;i++){
            if(i==c){
                a=b;
                b=c;
                c=a+b;
            }
            else{
                sum+=i;
            }
        }
        if(strongnumbercheck(sum)){
            System.out.println(" strong number");
        }
        else{
            System.out.println("not a strong number");
        }
        
    }
}
