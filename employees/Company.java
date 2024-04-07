package employees;

public class Company {

  public static void main(String[] args) {
    Employee[] employees = new Employee[7];

   
    employees[0] = new Manager("Jan Kowalski", 4000.0, 2);
    employees[1] = new Worker("Anna Nowak", 3500.0, "Sekretarka");
    employees[2] = new Worker("Tomasz Kot", 5000.0, "Programista");
    employees[3] = new Worker("Kasia Kropka", 4500.0, "Grafik");
    employees[4] = new Worker("Bartek Mazurek", 2500.0, "Programista");

    
    employees[5] = new Manager("Maciej Kop", 9000.0, 0); 
    employees[6] = new Worker("Bartosz Sadek", 4500.0, "Grafik");

    
    for (Employee employee : employees) {
      employee.setSalary(employee.getSalary() + 500.0);
    }

    
    for (int i = 0; i < employees.length; i++) {
      if (employees[i] instanceof Manager) {
        ((Manager) employees[i]).setNumberOfSubordinates(0);
        ((Manager) employees[i]).setSalary(7500.0);
      }
    }

    
    for (Employee employee : employees) {
      System.out.println(employee.toString());
    }
  }
}