public class SunnyNumber {
    public static boolean sunnyNumberCheck(int n){
        int N = n+1;
        for(int i =1;i<n;i++){
            if((i*i)==N){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int nth=3;
        int count =0;
        for(int i=1;i<1000;i++){
            if(sunnyNumberCheck(i)){
                count++;
            }
            if(nth==count){
                System.out.println(i);
                return;
            }
        }
        
    }
}
