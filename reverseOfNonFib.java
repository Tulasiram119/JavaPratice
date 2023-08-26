import java.util.ArrayList;
import java.util.Collections;

public class reverseOfNonFib {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=1;
        ArrayList <Integer> res = new ArrayList<>();
        for(int i=1;i<10;i++){
            if(i==c){
                a=b;
                b=c;
                c=a+b;
            }
            else{
                res.add(i);
            }
            
        }
        Collections.reverse(res);
        System.out.println(res.toString());
    }
}
