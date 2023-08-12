public class SummationFibannaci {
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int n3=0;
        int sum=0;
        for(int i=1;n3<=10;i++){
            
            System.out.print(n3+",");
            n1=n2;
            n2=n3;           
            n3=n1+n2;
            sum+=n2;
            
        }
        System.out.println();
        System.out.println(sum);
        

    }
}
