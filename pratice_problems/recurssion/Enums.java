

enum Laptop{
    MACBOOK(2000),WINDOWS(5777),SURFACE(88766);
    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}

public class Enums {
   public static void main(String[] args) {
    
    Laptop lap = Laptop.WINDOWS;
    System.out.println(lap.getPrice());
    
   } 
}
