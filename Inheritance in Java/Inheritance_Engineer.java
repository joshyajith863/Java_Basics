public class Inheritance_Engineer extends InheritanceEmployeee {
    public static void main(String[] args) {
        InheritanceEmployeee employee = new InheritanceEmployeee();

        int salary = 20000;
        System.out.println("The class is: Inheritance_Engineer");

        // Calculate salary using parent class method
        employee.calcSalary(salary);

        // Assign a new salary and display employee details
        salary = 10000;
        employee.display();

        // Calculate salary again
        employee.calcSalary(salary);
    }
}
