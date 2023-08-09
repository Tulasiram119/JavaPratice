public class Recursion {
    public static int factorial(int n){
        // int fact =1;
        // if(n>0){
        //     fact=n*factorial(n-1);
        // }
        // return fact;
        if(n==0){
            return 1;
        }
        int fmn = factorial(n-1);
        int fact = n*fmn;
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
        
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
        
    }
    public static int sumNat(int n){
        if(n==1){
            return 1;
        }
        int sum = n+sumNat(n-1);
        return sum;
    }
    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        int fibnm1 = fib(n-1);
        int fibnm2 = fib(n-2);
        int fibn = fibnm1+fibnm2;
        return fibn;
    }
    public static boolean isSorted(int [] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void fibaSeries(int n){
        int n1 =0;
        int n2 =1;
        int count =50;
        System.out.print(n1+" "+n2);
        for(int i =2;i<=count;i++){
            int n3 = n1+n2;
            System.out.print(" "+n3+" ");
            n1 = n2;
            n2=n3;
        }
    }
    public static int firstOcc(int [] arr,int i,int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        
        return firstOcc(arr, i+1, key);
        
    }
    public static int lastOcc(int [] arr,int i,int key){
        if(i== arr.length){
            return -1;
        }
        int isFound = lastOcc(arr, i+1, key);
        if(isFound==-1 && arr[i]==key){
            return i;
        } 
        return isFound;
    }
    public static int power(int x,int n){
        if(n==1){
            return x;
        }
        
        return x*power(x,n-1);

    }
    public static int optiPower(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpow=optiPower(x, n/2);
        int halfpowsq = halfpow*halfpow;
        if(n%2!=0){
            halfpowsq = x*halfpowsq;
        }
        return halfpowsq;
    }
    public static int tillingProblem(int n){//2 *n tiles
        //basecondition
        if(n==0||n==1){
            return 1;
        }
        //vertical
        int fnm1 = tillingProblem(n-1);
        //horizontal
        int fnm2 = tillingProblem(n-2);
        //total ways
        int totways = fnm1+fnm2;
        return totways;
    }
    public static void removeDuplicates(String str, int idx,StringBuilder newStr,boolean[] map){
        // base case
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            //duplicate
            removeDuplicates(str, idx+1, newStr, map);
        }
        else{
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static int friendsPair(int n){
        //choice
        //single
        if(n==1||n==2){
            return n;
        }
        // int fnm1 = friendsPair(n-1);

        // //pairs
        // int fnm2 = friendsPair(n-2);
        // int pairWays = (n-1)*fnm2;

        // //totways
        // int totways = fnm1+pairWays;
        return friendsPair(n-1)+(n-1)*friendsPair(n-2);

    }
    public static void printBinStrings(int n,int lastPlace,String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        
        
        
        
        
        //kaam
        // if(lastPlace==0){

        //     printBinStrings(n-1, 0, str.append("0"));
        //     printBinStrings(n-1, 1, str.append("1"));

        // }
        // else{
        //     printBinStrings(n-1, 0, str.append("0"));
        // }
        printBinStrings(n-1, 0, str+"0");
        if(lastPlace==0){
            printBinStrings(n-1, 1, str+"1");
        }

    }
    public static void main(String[] args) {
        //System.out.println(factorial(5));
        //printNumbersInDesecingOrder(10);
        //printInc(10);
        //System.out.println(sumNat(100));
        //System.out.println(fib(6));
        int [] arr = {1,2,4,3,5,55,5,5};
        //System.out.println(isSorted(arr, 0));
        //fibaSeries(10);
        //System.out.println(firstOcc(arr, 0, 5));
        //System.out.println(lastOcc(arr, 0, 5));
        //System.out.println(power(2, 10));
        //System.out.println(optiPower(2,10));
        //System.out.println(tillingProblem(4));
        //String str = "kancharlatulasiram";
        //removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        //System.out.println(friendsPair(3));
        printBinStrings(3, 0,"");
    }
}
