package app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by asi234 on 9/23/2017.
 */
public class Employee {
  String name;
  Integer age;
  String department;

  public Employee() {
    System.out.println("....Default Constructor called for Employee");
  }

  public Employee(String name, Integer age, String department) {
    System.out.println("....Parameterized  Constructor called for Employee");
    this.name = name;
    this.age = age;
    this.department = department;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    System.out.println("....Setter called for Employee To Set Name");
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    System.out.println("....Setter called for Employee To Set Age");
    this.age = age;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    System.out.println("....Setter called for Employee To Set department");
    this.department = department;
  }

  @Override
  public String toString() {
    return "Employee{" +
      "name='" + name + '\'' +
      ", age=" + age +
      ", department='" + department + '\'' +
      '}';
  }
}
