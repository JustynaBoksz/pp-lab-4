public class Company {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Jan Kowalski", 4000.0);
        employees[1] = new Employee("Anna Nowak", 3500.0);
        employees[2] = new Employee("Tomasz Kot", 5000.0);
        employees[3] = new Employee("Kasia Kropka", 4500.0);
        employees[4] = new Employee("Bartek Mazurek", 2500.0);

        System.out.println("Dane pracownika o indeksie 3:");
        System.out.println(employees[3].toString());

        employees[3].setSalary(4800.0);

        System.out.println("\nDane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}