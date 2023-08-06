public class SuperKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);  
        Animal a = new Animal();
        System.out.println(a.color);      
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("Animal counstuctor is called ");
    }
}
class Horse extends Animal{
    Horse(){
        super.color="Brown";
        System.out.println("Horse constructor is created");
    }
}
