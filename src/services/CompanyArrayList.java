package services;

import entities.employee;
import interfaces.IGestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompanyArrayList implements IGestion<employee> {

    private List<employee> employees = new ArrayList<>();

    @Override
    public void addEmployee(employee employee) {
        employees.add(employee);
    }

    @Override
    public boolean searchEmployee(String name) {
        for (employee employee : employees) {
            if (employee.getLastName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean searchEmployee(employee employee) {
        return employees.contains(employee);
    }

    @Override
    public void deleteEmployee(employee employee) {
        employees.remove(employee);
    }

    @Override
    public void displayEmployee() {
        for (employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Override
    public void sortEmployeeById() {
        Collections.sort(employees);
    }

    // Comparator : by department name, and if same department, by grade
    @Override
    public void sortEmployeeByDepartementNameAndGrade() {
        Collections.sort(employees, new EmployeeDepartmentComparator()
                .thenComparing(new EmployeeGradeComparator()));
    }
}

class EmployeeDepartmentComparator implements Comparator<employee> {
    @Override
    public int compare(employee e1, employee e2) {
        return e1.getDepartmentName().compareTo(e2.getDepartmentName());
    }
}

// Comparator : compares 2 employees by grade
class EmployeeGradeComparator implements Comparator<employee> {
    @Override
    public int compare(employee e1, employee e2) {
        return e1.getGrade() - e2.getGrade();
    }
}