package interfaces;
public interface IGestion<T> {

    public void addEmployee(T t);

    public boolean searchEmployee(String name);

    public boolean searchEmployee(T t);

    public void deleteEmployee(T t);

    public void displayEmployee();

    public void sortEmployeeById(); //Comparable

    public void sortEmployeeByDepartementNameAndGrade(); //Comparator
}