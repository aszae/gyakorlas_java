package gyak7CompanyException;

import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>{
    private int id;
    private Department department;

    public Employee(int id,String name, LocalDate birthDate) throws WrongBirthDateException {
        super(name, birthDate);
        this.id = id;
    }

    public Employee(int id, String name, LocalDate birthDate, String nickName) throws WrongBirthDateException {
        super(name, birthDate, nickName);
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department dept) throws DeptNotContainEmpException {
        if (dept == null){
            this.department = null;
            return;
        }
        for (Employee e : dept.getEmployees()){
            if (e.equals(this)){
                this.department = dept;
                return;
            }
        }
        throw new DeptNotContainEmpException("Department has no such emloyee");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", department=").append(department);
        sb.append(", birthDate=").append(super.getBirthDate());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, department);
    }

    @Override
    public int compareTo(Employee e){
        return this.getId()-e.getId();
    }
}
