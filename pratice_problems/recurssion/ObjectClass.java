

class A{
    public String name ; 
    public int age ;
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        A other = (A) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        return true;
    }
}
public class ObjectClass {
    public static void main(String[] args) {
        A a = new A();
        a.name = "tulasiram";
        a.age = 23;
        A b = new A();
        b.name = "tulasiram";
        b.age = 23;
        System.out.println(a.equals(b));
    }
}
