public class BackTrcakingAssignments {
    public static void printMaze(int maze[][]){
        for(int i =0;i<maze.length;i++){
            for(int j =0;j<maze.length;j++){
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int maze[][],int x,int y){
        return (x>=0 && x<maze.length && y>=0 && y < maze.length && maze[x][y]==1);
    }
    public static boolean solveMaze(int maze[][]){
        int N = maze.length;
        int sol[][] = new int[N][N];
        if(solveMazeUntill(maze,0,0,sol) == false){
            System.out.println("solution does not exist");
            return false;
        }
        printMaze(sol);
        return true;

    }
    public static boolean solveMazeUntill(int maze[][], int i,int j,int sol[][]){
        if(i == maze.length-1 && j == maze.length-1 && maze[i][j]==1 ){//base case
            sol[i][j] = 1;
            return true;
        }
        if(isSafe(maze, i, j) == true){
            if(sol[i][j] == 1){
                return false;
            }
            sol[i][j] = 1;
            if(solveMazeUntill(maze,i+1,j,sol)){
                return true;
            }
            if(solveMazeUntill(maze,i,j+1,sol)){
                return true;
            }
            sol[i][j] = 0;
            return false;

        }
        return false;
    }
    public static void letterCombinations(String D){
        int len = D.length();
        if(len ==0){
            System.out.println(" ");
            return;
        }
        bfs(0,len,new StringBuilder(), D);
    }
    public static void bfs(int pos, int len, StringBuilder sb, String D){
        if(pos == len){
            System.out.println(sb.toString());
        }else{
            char [] letters = L[Character.getNumericValue(D.charAt(pos))];
            for(int i=0;i<letters.length;i++){
                bfs(pos+1,len, new StringBuilder(sb).append(letters[i]),D);
            }
        }
    }
    static int N =8;
    final static char[][] L= {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
    public static boolean isSafeK(int x,int y, int sol[][]){
        return (x>=0 && x<N && y>=0 && y<N && sol[x][y]==-1);
    }
    public static boolean solveKT(){
        int sol[][] = new int[8][8];
        for(int x =0;x<N;x++){
            for(int y=0;y<N;y++){
                sol[x][y]= -1;
            }
        }
        int[] xMove = {2,1, -1, -2, -2, -1,1,2};
        int[] yMove = {1,2,2,1, -1, -2, -2, -1};
        sol[0][0] = 0;
        if(!solveKtUntill(0,0,1,sol,xMove,yMove)){
            System.out.println("Solution does not exist");
            return false;
        }
        else{
            printMaze(sol);
        }
        return true;
    }
    public static boolean solveKtUntill(int x,int y, int movei,int sol[][] , int xMove[],int yMove[]){
        int k , next_x, next_y ;
        if(movei == N*N){
            return true;
        }
        for(k=0;k<8;k++){
            next_x = x+ xMove[k];
            next_y = y+ yMove[k];
            if(isSafeK(next_x,next_y,sol)){
                sol[next_x][next_y] = movei;
                if(solveKtUntill(next_x, next_y, movei+1, sol, xMove, yMove)){
                    return true;
                }
                else{
                    sol[next_x][next_y]=-1;
                }
            }
        }
        return false;
    } 
    public static void main(String[] args) {
        int maze[][] = { {1,0,0,0},{1,1,0,1},{0,1,0,0},{1,1,1,1}};
        //solveMaze(maze);
        //letterCombinations("23456789");
        solveKT();

    }
}
