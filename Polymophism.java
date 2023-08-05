public class Polymophism {
    public static void main(String[] args) {
        // Calculator cal = new Calculator();
        // System.out.println(cal.sum(1,2));
        // System.out.println(cal.sum(1.5f,2.5f));
        // System.out.println(cal.sum(1,2,3));
        Deer deer = new Deer();
        deer.eat();
        
    }
}

class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}