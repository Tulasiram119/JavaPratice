public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);
        Peacock peacock = new Peacock();
        peacock.dance();
        peacock.eat();
        
    }
}
//Base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

// derived class
class Fish extends Animal{
    int fins;
    void swin(){
        System.out.println("swins");
    }

}

class Mammal extends Animal{
    int legs;
    void walk(){
        System.out.println("walks");
    }
}
class Birds extends Animal{    
    void fly(){
        System.out.println("flys");
    }

}
class Dog extends Mammal{
    String breed;
    void barks(){
        System.out.println("barks");
    }
}
class cat extends Mammal{
    String name;
    void meow(){
        System.out.println("Meows");
    }
}
class Human extends Mammal{
    String name;
    void talks(){
        System.out.println("talks");
    }
}
class Shark extends Fish{
    String length;
    void age(){
        System.out.println("lives longer");
    }
}
class tuna extends Fish{
    String size;
    void cook(){
        System.out.println("not dangerous");
    }
}
class Peacock extends Birds{
    String availability;
    void dance(){
        System.out.println("it dances when rains");
    }
}