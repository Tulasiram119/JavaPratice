public class BitOperationsAssignment {
    public static int question1(int n){
        int a =n;
        int ans =1;
        while(n>0){
            if((n&1)!=0){
                ans = ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void question2(int n,int m){
        int a=n;
        int b=m;
        n=n^m;
        m=n^m;
        n=n^m;
        System.out.println(a+" value changed into "+n);
        System.out.println(b+" value changed into "+m);

    }
    public static int question3(int n){
        int m=1;
        while((int)(n&m) !=0){
            n=n^m;
            m=m<<1;

        }
        n=n^m;
        return n;
    }
    public static void question4(){
        for(char i = 'A';i<='Z';i++){
            System.out.print((char)(i |' '));
        }
    }
    
    
    
    
    
    public static void main(String[] args) {
        //System.out.println(question1(5));
        //question2(10, 12);
        //System.out.println(question3(15));
        question4();
    }
}
