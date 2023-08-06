public class Recursion {
    public static int factorial(int n){
        int fact =1;
        if(n>0){
            fact=n*factorial(n-1);
        }
        return fact;
    }
    public static void printNumbersInDesecingOrder(int n){
        // if(n>0){
        //     System.out.print(n+" ");
        //     printNumbersInDesecingOrder(n-1);
        // }
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printNumbersInDesecingOrder(n-1);
    }
    public static void printInc(int n){
        System.out.print(1+" ");
        printInc(n-1);
    }
    public static void main(String[] args) {
        //System.out.println(factorial(10));
        printNumbersInDesecingOrder(10);
    }
}
