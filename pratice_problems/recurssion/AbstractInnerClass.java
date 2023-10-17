package pratice_problems.recurssion;

abstract class A {
    abstract public void add(int a, int b);
}

public class AbstractInnerClass {
    public static void main(String[] args) {
        A a = new A() {
            public void add(int a, int b) {
                System.out.println(a + b);
            }
        };
        a.add(10, 20);
    }
}