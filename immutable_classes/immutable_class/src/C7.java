public class C7 {
    public static void main(String[] args) {
        Address address = new Address("VSKP", "Andhra Pradesh");
        Employee emp1 = new Employee(101, "Neharika", address);
        System.out.println(emp1.getAddress().getCity());
        System.out.println(emp1.getAddress().getState());

        Address copy = emp1.getAddress();

        System.out.println(copy == emp1.getAddress());
    }
}

class Address {
    private String city;
    private String state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}

final class Employee {
    private final int id;
    private final String name;
    private final Address address;

    Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = new Address(address.getCity(), address.getState());
    }

    public Address getAddress() {
        return new Address(address.getCity(), address.getState());
    }
}