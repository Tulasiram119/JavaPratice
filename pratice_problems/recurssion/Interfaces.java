package pratice_problems.recurssion;

/**
 * Demo
 */
interface Demo {
    /* By default the methods are both abstract and public */
    void show();
    void display();
}
interface Memo {
    /* By default the methods are both abstract and public */
    void see();
    void view();
}
class Sample implements Demo , Memo{
    public void show(){
        System.out.println("show");
    }
    public void display(){
        System.out.println("display");
    }
    public void see(){
        System.out.println("see");
    }
    public void view(){
        System.out.println("view");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.display();
        sample.show();
        sample.view();
        sample.see();
    }
}
