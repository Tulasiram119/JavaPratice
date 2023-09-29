package pratice_problems.recurssion;
import java.util.Scanner;
public class sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day");
        String weekday = sc.next();
        if(weekday.equalsIgnoreCase("sunday") || weekday.equalsIgnoreCase("saturday")){
            System.out.println("it's a weekend");
        } else{
            System.out.println("it's a weekday");
        }
    }
}
