package entities;

public class employee implements Comparable<employee> {
    private int id;
    private String lastName;
    private String firstName;
    private String departmentName;
    private int grade;

    public employee() {
    }

    public employee(int id, String lastName, String firstName, String departmentName, int grade) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.departmentName = departmentName;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof employee)) {
            return false;
        }
        employee other = (employee) obj;
        return id == other.id && lastName != null && lastName.equals(other.lastName);
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", lastName='" + lastName + "', firstName='" + firstName
                + "', department='" + departmentName + "', grade=" + grade + "}";
    }

    @Override
    public int compareTo(employee e) {
        return this.id - e.id;
    }
}