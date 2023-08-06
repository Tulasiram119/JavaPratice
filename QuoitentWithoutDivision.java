public class QuoitentWithoutDivision {
    
    public static int division(int dividend,int divisor){
        int sign = (dividend<0 || divisor<0)?-1:1;
        dividend=Math.abs(dividend);
        Math.abs(divisor);
        int quotient =0;
        while(dividend>=divisor){
            dividend-=divisor;
            ++quotient;
        }
        if(sign==-1){
            quotient=-quotient;
        }
        return quotient;
    }
    
    
    public static void main(String[] args) {
        int a =500;
        int b=-10;
        System.out.println(division(a, b));
    }
}
