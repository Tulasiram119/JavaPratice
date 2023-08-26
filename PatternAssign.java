public class PatternAssign {
    public static void main(String[] args) {
        number();
        norPattern();
        mixPatt();
    }
    public static void number(){
        for(int i=1;i<=5;i++){
            int var =8;
            int star = 6-i;
            for(int j=0;j<=5;j++){
                while(star>0){
                    System.out.print(" "+var+" ");
                    var--;
                    star--;
                }
            }
            System.out.println();
        }
    }
    public static void norPattern(){
        for(int i=1;i<=8;i++){
            for(int j=1;j<=8;j++){
                if(i==1||i==8||j==1||j==8||i<=j){
                    System.out.print(" "+"*"+" ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void mixPatt(){
        int var =9;
        char ch ='a';

        for(int i=1;i<=6;i++){
            int star = 6-i;
            for(int j=1;j<=6;j++){
                while(star>0){
                    if(j%2!=0){
                        System.out.print(" "+var+" ");
                        var--;
                    }
                    else{
                        System.out.print(" "+ch+" ");
                        ch++;
                    }
                    star--;

                }
               

            }
            System.out.println();
        }
    }
}
