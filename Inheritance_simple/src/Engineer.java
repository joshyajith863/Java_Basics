public class Engineer extends Employee{
    Employee employee = new Employee();
    public static void main(String[] args) {

        int salary  = 20000;
        employee.display();
        employee.calcSalary(salary);
        salary = 10000;
        employee.calcSalary(salary);

    }
}

