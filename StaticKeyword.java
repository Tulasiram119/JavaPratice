public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name="tulasiram";
        s2.name = "Harish";
        s1.rollno = 1234;
        s2.rollno=4567;
        s1.schoolName="Sri raghavendra High school";
        System.out.println(s1.name+" "+s1.rollno+" "+s1.schoolName);
        System.out.println(s2.name+" "+s2.rollno+" "+s2.schoolName);
        // due to static keyword i don't have to decalre school name for s2 
        //since it is static it automatically takes s1 scahoolname

        
    }

}
class Student{
    String name;
    int rollno;
    static String schoolName;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
