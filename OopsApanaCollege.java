public class OopsApanaCollege {
    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.setColor("Blue");
        // System.out.println(p1.getColor());
        // p1.setTip(5);
        // System.out.println(p1.getTip());
        // p1.setColor("Yellow");
        // System.out.println(p1.getColor());
        // BankAccount myAccount = new BankAccount();
        // myAccount.username = "Tulasiram";
        // myAccount.setPassword("Unknown");
        // System.out.println(myAccount.username);
        // myAccount.getPassword();
        Student s1 = new Student();
        s1.name = "tulasiram";
        s1.age=22;
        s1.password="aaaaaa";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        Student s2 = new Student(s1);
        s2.password="bbbbbbb";
        s1.marks[2]=100;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        
    }
}
class Pen{
    private String color;
    private int tip;
    void setColor(String color){
        this.color = color;
    }
    void setTip(int tip){
        this.tip= tip;
    }
    public String getColor(){
        return this.color;
    }
    public int getTip(){
        return this.tip;
    }
}
class Student{
    String name;
    int age;
    float percentage;
    String password;
    int[] marks;
    //shallow copy constructor
    // Student(Student obj){
    //     marks =  new int[3];
    //     this.name =obj.name;
    //     this.age = obj.age;
    //     this.password= obj.password;
    //     this.marks=obj.marks;
    // }
    //Deep copy
    Student(Student obj){
        marks =  new int[3];
        this.name =obj.name;
        this.age = obj.age;
        this.password= obj.password;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=obj.marks[i];
        }
    }
    Student(){
        System.out.println("Custructor is created");
        marks =  new int[3];
    }
    Student(String name){
        this.name = name;
        marks =  new int[3];
    }
    Student(int age){
        this.age = age;
        marks =  new int[3];
    }
    void calcuPercentage(int phy,int math,int chem){
        percentage = (phy+math+chem)/ 3;
    }
}
class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
    public void getPassword(){
        System.out.println(password);
    }

    
}
