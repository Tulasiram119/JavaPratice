public class OppsAssignment {
    public static void main(String[] args) {
        Complex com = new Complex(12,2);
        com.sum();
        com.difference();
        
    }
}
class Complex{
    int real;
    int imaginary;
    Complex(int real,int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    } 
    void sum(){
        System.out.println(real+imaginary);
    }  
    void difference(){
        System.out.println(real-imaginary);
    }
}
