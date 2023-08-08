/**
 * Automorphic
 */
public class Automorphic {
    public static boolean automorphicCheck(int n){
        int sq=n*n;
        while(n>0){
            if(n%10!=sq%10){
                return false;
            }
            n=n/10;
            sq=sq/10;
            
        }
        return true;
    }

    public static void main(String[] args) {
        int nth=5;
        int count=0;
        for(int i=1;i<100;i++){
            if(automorphicCheck(i)){
                count++;
            }
            if(count==nth){
                System.out.println(i);
                return;
            }
        }
        
        
    }
}