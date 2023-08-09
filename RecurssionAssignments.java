public class RecurssionAssignments {
    public static void keyIndex(int[] arr,int i,int k){
        //base case
        if(i==arr.length){
            return;
        }
        if(arr[i]==k){
            System.out.print(i+" ");
        }
        keyIndex(arr, i+1, k);
    }
    public static void numToWord(int n,String [] arr){
        if(n==0){
            return;
        }
        int lastDigit=n%10;
        numToWord(n/10,arr);
        System.out.print(arr[lastDigit]+" ");
        
        
        
    }
    public static int length(String str){
        if(str.equals("")){
            return 0;
        }
        return length(str.substring(1 ))+1;
    }
    public static int countSubStrings(String str,int i,int j,int n){
        if(n==1){
            return 1;
        }
        if(n<=0){
            return 0;
        }
        int res = countSubStrings(str, i+1, j, n-1)+
                countSubStrings(str, i, j-1, n-1)-
                countSubStrings(str, i+1, j-1, n-2);
        if(str.charAt(i)==str.charAt(j)){
            res++;
        }
        return res;
    }
    public static void towerOfHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("transfer disk " +n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk " +n+" from "+src+" to "+dest);
        towerOfHanoi(n-1, helper, src, dest);
    }

    
    
    public static void main(String[] args) {
        int [] arr ={3, 2, 4, 5, 6, 2, 7, 2, 2};
        //keyIndex(arr, 0, 2);
        //String [] word = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        //numToWord(143, word);
        //System.out.println(length("ram"));
        String str = "aabvsdaa";
        //int n= str.length();
        //System.out.println(countSubStrings(str, 0, n-1, n));
        towerOfHanoi(3, "s", "h", "d");

    }
}
