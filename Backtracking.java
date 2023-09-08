public class Backtracking {
    static int count =0;
    public static void main(String[] args) {
        int [] arr = new int[5];
        //changeArr(arr, 0, 01);
        // printArr(arr);
        String str = "abc";
        //subSets(str, "", 0);
        //permutations(str, "");
        int n = 8;
        int x =3;
        int y =3;
        char [][] board = new char[n][n] ;
        for(int i= 0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        //nQueens(board,0);
        //System.out.println(count);
        if(nQueen(board, 0)){
            //System.out.println("solution is possible");
            //printBoard(board);
        }
        else{
            //System.out.println("Solution is not possible");
        }
        System.out.println(gridWays(0, 0, x, y));
        System.out.println(linearGridways(x, y));
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
    public static boolean isSafe(char[][] board,int row,int col){
        //vertically up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagnoally left up
        for(int i =row-1,j=col-1;i>=0 && j>=0 ;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagnollay right up
        for(int i = row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;

    }
    public static void nQueens(char[][] board, int row){
        //base case
        if(row==board.length){
            //printBoard(board); 
            count++;           
            return;
        }
        for(int j =0;j< board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueens(board, row+1);//recursion step
                board[row][j]='.';//backtracking step
            }
            
        }
    }
    public static void printBoard(char[][] board){
        System.out.println("---chessboard---");
        for(int i= 0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean nQueen(char[][] board, int row){
        //base case
        if(row==board.length){
            //printBoard(board); 
            //count++;           
            return true;
        }
        for(int j =0;j< board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                if(nQueen(board,row+1)){ //recurssion
                    return true;
                }
                board[row][j]='.';//backtracking
                
            }
            
        }
        return false;
    }
    public static int gridWays(int i, int j,int x, int y){
        if(i==x-1 && j==y-1){
            return 1;
        }
        else if(i==x||j==y){
            return 0;
        }      
        int w1 = gridWays(i+1, j, x, y);
        int w2 = gridWays(i, j+1, x, y);
        return w1+w2;
    }
    public static int factorial(int n){
        int fact=1;
        for(int i =1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static int linearGridways(int x,int y){
        return ((factorial(x-1+y-1))/(factorial(x-1)*factorial(y-1)));
    }
}
