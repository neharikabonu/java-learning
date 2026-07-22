public class C20 {
  public static void main(String[] args) {
    Manager manager1 = new Manager("Neharika", 101);
    TaxPayer tax1 = manager1;

    manager1.display();
    tax1.taxStatus();
  }
}

abstract class Employee {
  String name;
  int empID;

  Employee(String name, int empID) {
    this.name = name;
    this.empID = empID;
  }

  public void display() {
    System.out.println("Name: " +name);
    System.out.println("ID: " +empID);
  }
}

interface TaxPayer {
  void taxStatus();
}

class Manager extends Employee implements TaxPayer {
  Manager(String name, int empID) {
    super(name, empID);
  }
  @Override
  public void taxStatus() {
    System.out.println("Paid");
  }
}