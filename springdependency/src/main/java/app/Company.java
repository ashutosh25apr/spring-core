package app;

/**
 * Created by asi234 on 9/23/2017.
 */
public class Company {
  private Employee employee;

  public Company() {
    System.out.println("....Default Constructor called for Company");
  }

  public Company(Employee employee) {
    System.out.println("....Parameterized Constructor called for Company");
    this.employee = employee;
  }

  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    System.out.println("....Setter called for Company");
    this.employee = employee;
  }

  @Override
  public String toString() {
    return "Company{" +
      "employee=" + employee +
      '}';
  }
}
