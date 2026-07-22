public class C28 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address a1 = new Address("Hyderabad");

        Student0 s1 = new Student0(101, "Ram", a1);

        Student0 s2 = (Student0) s1.clone();

        s2.address.city = "Delhi";

        System.out.println(s1.address.city);
        System.out.println(s2.address.city);
    }
}

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Student0 implements Cloneable {
    int id;
    String name;
    Address address;

    Student0(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}