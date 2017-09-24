
package app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by asi234 on 9/23/2017.
 */

public class MainRunner {
  private Company company;
 static final  ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/application-context.xml");
  /**
     * Main method.
     */
    public static void main(String[] args) {
      Company company = (Company) applicationContext.getBean("company");
      System.out.println(company);
      Employee employee = company.getEmployee();
      System.out.println(employee);
      Employee employeeIndexed = getEmployee();
      System.out.println(employeeIndexed);
    }
    private static Employee getEmployee(){
      Employee employee = (Employee) applicationContext.getBean("employeeIndexed");
      return employee;
    }


  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }
}
