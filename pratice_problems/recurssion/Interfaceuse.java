package pratice_problems.recurssion;
interface Computer{
    void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("coding in laptop");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("coding in desktop");
    }
}
class Dev {
    public void develop(Computer computer){
        computer.code();
    }
}
public class Interfaceuse {
   public static void main(String[] args) {
    Dev ram = new Dev();
    Dev tulasi = new Dev();
    Computer lap = new Laptop();
    Computer desk = new Desktop();
    ram.develop(lap);
    tulasi.develop(desk);
   } 
}
