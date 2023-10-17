package pratice_problems.recurssion;

public class WrapperClass {
    public static void main(String[] args) {
        int num1 = 65;
        Integer num2 = num1;//boxing
        num1 = num2;//unboxing
        String a = "33"; 
        System.out.println(Integer.parseInt(a)*56);
    }
}
