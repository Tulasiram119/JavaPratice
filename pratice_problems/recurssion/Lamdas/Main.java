package Lamdas;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        MiddleClass middle = new MiddleClass();
        MiddleClass.run(new Interface() {
            public void test(){
                System.out.println("Inner annomyous class");
            }
        });
        MiddleClass.run(()->{System.out.println("inner class");});

    }
}