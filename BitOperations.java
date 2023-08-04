public class BitOperations {
    public static int getIthBit(int n,int i){
        int bitmask = 1<<i;
        if((n&bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }

    }
    public static int setIthBit(int n,int i){
        int bitmask = 1<<i;
        return n |bitmask;
    }
    public static int clearIthBit(int n,int i){
        int bitmask = ~(1<<i);
        return (n&bitmask);
    }public static int updateIthBit(int n,int i,int newbit){
        // if(newbit ==0){
        //     return clearIthBit(n, i);
        // }
        // else{
        //     return setIthBit(n, i);
        // }
        int k = clearIthBit(n, i);
        int bitmask = newbit<<i;
        return k|bitmask;

        
    }
    public static int clearIthBits(int n,int i){
        int bitmask = ~(0)<<i;
        return n & bitmask;
    }
    public static int clearBitsInRange(int n,int i,int j){
        int a = ((~0)<<j+1);
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n & bitmask;

    }
    public static boolean check2Power(int n){
        return (n&n-1)==0;
    }
    public static int countSetBits(int n){
        int count =0;
        while(n>0){

        
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static int fastExpo(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans = ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    
    
    
    public static void main(String[] args) {
        //System.out.println(clearBitsInRange(10, 2,4));
        //System.out.println(check2Power(18));
        //System.out.println(countSetBits(16));
        System.out.println(fastExpo(2, 2));
    }
}
