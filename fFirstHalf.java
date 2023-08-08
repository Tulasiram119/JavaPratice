public class fFirstHalf {
    public static void main(String[] args) {
        int n = 123445;
        int temp =n;
        int count =0;
        while(temp>0){
            count++;
            temp/=10;
        }
        int expo=1;
        for(int i=1;i<=count/2;i++){
            expo = expo*10;
        }
        int k= n/expo;
        int temp2 = k;
        int sum=0;
        while(temp2>0){
            int digit = temp2%10;
            sum+=digit;
            temp2/=10;

        }
        int sum2 = 0;
        for(int i=1;i<sum;i++){
            if(sum%i==0){
                sum2+=i;
            }
        }
        if(sum==sum2){
            System.out.println("perfect number "+sum+" "+sum2);
        }
        else{
            System.out.println("not a perfect number "+sum+" "+sum2);
        }

    }
}
