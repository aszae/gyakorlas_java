package gyak7CompanyException;

import java.util.HashSet;
import java.util.Objects;

public class Department implements Comparable<Department>{
    private String id;
    private String name;
    private HashSet<Employee> employees;

    public Department(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public HashSet<Employee> getEmployees() {
        return this.employees;
    }

    public void addEmployee(Employee e) throws DeptNotContainEmpException{
        this.employees.add(e);
        e.setDepartment(this);
    }

    public void removeEmployee(Employee e) throws DeptNotContainEmpException{
        this.employees.remove(e);
        e.setDepartment(null);
    }

    public void employeeeMove(Employee emp, Department fromDept, Department toDept){
        toDept.addEmployee(emp);
        fromDept.removeEmployee(emp);

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(employees, that.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employees);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Department{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", employees=").append(employees);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Department o){
        return this.id.compareTo(o.id);
    }
}
