
@FunctionalInterface
interface fuctional{
    int run(int b,int c);    
}
// class B implements fuctional{

//     public void run(){
//         System.out.println("run");
//     }
// }
public class FUnctionalInterface {
    public static void main(String[] args) {
        fuctional a = (b,c)->  b+c;
        
        System.out.println(a.run(5,5));
        

    }
}
