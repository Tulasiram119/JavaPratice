public class Backtracking {
    public static void main(String[] args) {
        int [] arr = new int[5];
        //changeArr(arr, 0, 01);
        // printArr(arr);
        String str = "abc";
        //subSets(str, "", 0);
        permutations(str, "");
    }
    public static void changeArr(int[] arr,int i,int var){
        // base case
        if(i==arr.length){
            printArr(arr);
            return;
        }

        //Recursion
        arr[i]=var;
        changeArr(arr, i+1, var+1);
        arr[i]=arr[i]-2;//backtracking step
    
    }
    public static void subSets(String str,String ans,int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }

        //recursion
        //yes case
        subSets(str, ans+str.charAt(i), i+1);
        //no case
        subSets(str,ans,i+1);
    }
    public static void permutations(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //permutation
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            permutations(newStr, ans+curr);
        }



    }
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
