public class Inehritance_Engineer extends inheritance_Employeee{
    public static void main(String[] args) {
        inheritance_Employeee employee = new inheritance_Employeee();
        int salary  = 20000;
        System.out.println("The class is :Inheritance_Engineer");
        employee.calcSalary(salary);
        salary = 10000;
        employee.display();
        employee.calcSalary(salary);

    }
}

