/**
 * LastHalf
 */
public class LastHalf {

    public static void main(String[] args) {
        int n = 123456;
        int temp = n;
        int count=0;
        while(temp>0){
            count++;
            temp/=10;
        }

        int expo=0;
        for(int i=1;i<=count;i++){
            int digit=n%10;
            if(i>count/2){
                expo=expo*10+digit;
            }
            
            n/=10;
        }
        System.out.println(expo);
    }
}