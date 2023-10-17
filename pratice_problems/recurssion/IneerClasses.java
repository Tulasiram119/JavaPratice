package pratice_problems.recurssion;



class A{
    class B{
        public void view(){
            System.out.println("viewing");
        }
    }
    public void show(){
        System.out.println("showing");
        
    }
}
public class IneerClasses {
    public static void main(String[] args) {
        A a = new A()
        {
            public void show(){
                System.out.println("showing in new");
        
            }
            
        };
        a.show();
        A.B b = a.new B()
        {
            public void view(){
            System.out.println("viewing in different view");
            }

        };
        b.view();
        
    }
}
