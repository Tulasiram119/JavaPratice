package pratice_problems.recurssion;

public class EasyProblems {
    public static void print1toN(int n, int i) {
        // base case
        if (i > n) {
            System.out.println();
            return;
        }
        // recurssion
        System.out.print(i + " ");
        print1toN(n, i + 1);
    }

    public static void printNto1(int n) {
        // base case
        if (n == 0) {
            System.out.println();
            return;
        }
        // recurssion
        System.out.print(n + " ");
        printNto1(n - 1);
    }

    static int sum = 0;

    public static void mean(int arr[], int j) {
        // base case
        if (j == arr.length) {
            System.out.println((float) sum / j);
            return;
        }
        sum += arr[j];
        // recursion
        mean(arr, j + 1);
    }

    public static int sum(int n, int i) {
        // base case
        if (i == n) {
            return n;
        }
        int recursiveSum = sum(n, i + 1);
        return i + recursiveSum;
    }

    public static int decimalToBinary(int n) {
        if (n <= 1) {
            return n;
        }
        int digit = n % 2;
        int binaryDigit = decimalToBinary(n / 2);
        return binaryDigit * 10 + digit;
    }

    public static int sumOfArray(int arr[], int i) {
        // base case
        if (i == arr.length) {
            return 0;
        }
        // recursion
        int sum = arr[i] + sumOfArray(arr, i + 1);
        return sum;
    }

    public static String reverseString(String str, String res, int idx) {
        if (idx < 0) {
            return "";
        }
        res = str.charAt(idx) + reverseString(str, res, idx-1);
        return res;
    }
    public static int sumOfDigit(int num,int sum){
        //base case
        if(num%10 == 0){
            return num; 
        }
        //recursion
        sum = num%10 + sumOfDigit(num/10,sum);
        return sum;
    }
    public static void nFibanacci(int fib1,int fib2,int i,int n){
        //base case
        if(i==n){
            System.out.println();
            return;
        }
        //recurssion
        System.out.print(fib1+" ");        
        nFibanacci(fib2, fib1+fib2,i+1,n);
    } 
    public static int factorial(int n,int fact){
        if(n==1){
            return 1;
        }
        fact = n*factorial(n-1,fact);
        return fact;
    }
    public static void maxMinOfArray(int arr[],int max,int min,int i){
        if(i == arr.length){
            System.out.println("max :"+max +" "+ "min :"+min);
            return;
        }
        max = Math.max(arr[i],max);
        min = Math.min(arr[i],min);
        maxMinOfArray(arr,max,min,i+1);
    }
    public static boolean palindromeString(int ft,int ls,String str){
        if(ft==ls){
            return true;
        }
        if(str.charAt(ft)!=str.charAt(ls)){
            return false;
        }
        return palindromeString(ft+1,ls-1,str);
    }
    public static int countSetBits(int n){
        if(n==0){
            return 0;
        }
        if((n & 1) == 1){
            return 1+countSetBits(n>>1);
        } 
        else{
            return countSetBits(n>>1);
        }
    }
    public static void reverseFib(int fib1,int fib2,int n){
        //base case
        if(n<=0){
            System.out.println();
            return;
        }
        reverseFib(fib2, fib1+fib2,n-1);
        System.out.print(fib1+" "); 
        //recurssion                
        
    } 
    public static void main(String[] args) {
        // print1toN(4, 1);
        // printNto1(4);
        //int arr[] = { 1, 2, 3, 4 };
        // mean(arr, 0);
        // System.out.println(sum(10, 1));
        // System.out.println(decimalToBinary(5));
        // System.out.println(sumOfArray(arr, 0));
        //String str = "hello";
        //int idx = str.length()-1;
        //System.out.println(reverseString(str, "", idx));        
        //System.out.println(sumOfDigit(145, 0));
        //nFibanacci(0, 1, 0, 3);
        //System.out.println(factorial(4,1));
        //maxMinOfArray(arr,Integer.MIN_VALUE,Integer.MAX_VALUE,0);
        //String str = "teneut";
        //System.out.println(palindromeString(0, str.length()-1, str));
        //System.out.println(countSetBits(10));
        reverseFib(0, 1,4 );
    }
}
