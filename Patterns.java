public class Patterns {
    public static void patternE(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1||j==1||i==5||i==3){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void patternS(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1||i==3||i==5||(j==1&& i<=3)||(j==5&&i==4)){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    
    public static void patternT(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1||j==3){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    
    
    public static void patternI(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1||i==5||j==3){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void patternee(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1||i==3||i==5||j==5){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern9(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=4;j++){
                if(i==1||i==3||i==5||j==4||(j==1 && i!=4)){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern7(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=4;j++){
                if(i==1||j==4){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern4(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=3;j++){
                if(i==3||j==3||(j==1 && i<=3)){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void patternX(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==j||i+j==6){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void patternY(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i+j==6||i==j && j<=2){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void patternZ(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1||i==5||i+j==6){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patternZ();
    }
}
