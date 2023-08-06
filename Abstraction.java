public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse("Red");
        h.eat();
        h.walk();
        System.out.println(h.color);
        Chicken c = new Chicken("White");
        c.eat();
        c.walk();
        System.out.println(c.color);

    }
}

abstract class Animal {
    String color;
    Animal() {
        color = "browm";
    }

    void eat() {
        System.out.println("Animal Eats ");
    }

    abstract void walk();

}

class Horse extends Animal {
    Horse(String color){
        this.color = color;
    }
    void changeColor(String color){
        this.color = color;
    }

    void walk() {
        System.out.println("Walks on four legs");
    }
}

class Chicken extends Animal {
    Chicken(String color){
        this.color = color;
    }
    void walk() {
        System.out.println("walks on two legs");
    }
}
