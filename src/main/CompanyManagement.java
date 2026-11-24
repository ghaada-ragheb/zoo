package main;

import entities.employee;
import services.CompanyArrayList;

public class CompanyManagement {

    public static void main(String[] args) {

        CompanyArrayList company = new CompanyArrayList();

        employee e1 = new employee(3, "Ben Ali", "Sami", "IT", 2);
        employee e2 = new employee(1, "Trabelsi", "Amira", "HR", 3);
        employee e3 = new employee(5, "Gharbi", "Youssef", "IT", 1);
        employee e4 = new employee(2, "Jaziri", "Ines", "Finance", 2);
        employee e5 = new employee(4, "Mansour", "Karim", "HR", 1);

        company.addEmployee(e1);
        company.addEmployee(e2);
        company.addEmployee(e3);
        company.addEmployee(e4);
        company.addEmployee(e5);

        System.out.println(" List of employees ");
        company.displayEmployee();

        System.out.println("Search 'Gharbi' : " + company.searchEmployee("Gharbi"));
        System.out.println("Search 'Hamdi'  : " + company.searchEmployee("Hamdi"));

        employee copy = new employee(3, "Ben Ali", "Ahmed", "Finance", 5);
        System.out.println("Search employee with id 3 and name 'Ben Ali' : " + company.searchEmployee(copy));
        System.out.println("e1 equals copy : " + e1.equals(copy));

        System.out.println("Sorted by id ");
        company.sortEmployeeById();
        company.displayEmployee();

        System.out.println("Sorted by department name and grade ");
        company.sortEmployeeByDepartementNameAndGrade();
        company.displayEmployee();

        System.out.println("After deleting Jaziri ");
        company.deleteEmployee(e4);
        company.displayEmployee();
        System.out.println("Search 'Jaziri' : " + company.searchEmployee("Jaziri"));
    }
}