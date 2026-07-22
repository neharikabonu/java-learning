public class C17 {
  public static void main(String[] args) {
    for (EmployeeRole role : EmployeeRole.values()) {
      System.out.println(role);
    }
  }
}

enum EmployeeRole {
  ADMIN(90000),
  MANAGER(70000),
  DEVELOPER(60000),
  TESTER(50000);

  private final int salary;

  EmployeeRole(int salary) {
    this.salary = salary;
  }

  public int getSalary() {
    return salary;
  }

  @Override
  public String toString() {
    return name() + " : " +getSalary();
  }
}