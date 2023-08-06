public class Interfaces {
    public static void main(String[] args) {
        // Queen q = new Queen();
        // q.moves(); 
        Luffy luffy = new Luffy();
        Law law = new Law();
        luffy.power();
        law.power();
        luffy.Bounty();
        law.Bounty();
        luffy.crew();
        law.crew();
        luffy.influence();     
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagnoal(In all directions)");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagnoal(only bt one step)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
interface Emperors{
    void Bounty();
    void power();
    void crew();
    void influence();
}
interface WrostGeneration{
    void Bounty();
    void power();
    void crew();
}
class Luffy implements Emperors,WrostGeneration{
    public void Bounty(){
        System.out.println("3 Billon berries");
    }
    public void power(){
        System.out.println("Compared to Balckbeared and Shanks");
    }public void crew(){
        System.out.println("Contains crew larger than 100000");
    }
    public void influence(){
        System.out.println("more influence");
    }

}
class Law implements WrostGeneration{
    public void Bounty(){
        System.out.println("3 Billon berries");
    }
    public void power(){
        System.out.println("Compared to Kid");
    }public void crew(){
        System.out.println("Contains crew only 30 memebers");
    }

}