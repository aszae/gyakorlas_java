package gyak7CompanyException;


import com.sun.source.util.Trees;

import java.util.TreeSet;

public class Company {
    private String name;
    private String nameOfLeader;

    private TreeSet<Department> departments;

    public Company(String name, String nameOfLeader) {
        this.name = name;
        this.nameOfLeader = nameOfLeader;
    }

    public String getName() {
        return this.name;
    }

    public String getNameOfLeader() {
        return this.nameOfLeader;
    }

    public TreeSet<Department> getDepartments() {
        return this.departments;
    }

    public void setNameOfLeader(String nameOfLeader) {
        this.nameOfLeader = nameOfLeader;
    }
    public void addDepartments(Department dept){
        this.departments.add(dept);
    }

    public void removeDepartments(Department dept){
        this.departments.remove(dept);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Company{");
        sb.append("name='").append(name).append('\'');
        sb.append(", nameOfLeader='").append(nameOfLeader).append('\'');
        sb.append(", departments=").append(departments);
        sb.append('}');
        return sb.toString();
    }
}
