package employees;

public class Company {

  public static void main(String[] args) {
    Employee[] employees = new Employee[5];

    // Initial creation of employees (unchanged)
    employees[0] = new Manager("Jan Kowalski", 4000.0, 2);
    employees[1] = new Worker("Anna Nowak", 3500.0, "Sekretarka");
    employees[2] = new Worker("Tomasz Kot", 5000.0, "Programista");
    employees[3] = new Worker("Kasia Kropka", 4500.0, "Grafik");
    employees[4] = new Worker("Bartek Mazurek", 2500.0, "Programista");

    // Count workers and set as number of subordinates for the manager
    int numberOfWorkers = 0;
    for (Employee employee : employees) {
      if (!(employee instanceof Manager)) {
        numberOfWorkers++;
      }
    }
    ((Manager) employees[0]).setNumberOfSubordinates(numberOfWorkers);

    // Set salary of manager
    ((Manager) employees[0]).setSalary(7500.0);

    // Print employee information (unchanged)
    for (Employee employee : employees) {
      System.out.println(employee.toString());
    }
  }
}