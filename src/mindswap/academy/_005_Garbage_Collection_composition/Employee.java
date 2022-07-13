package mindswap.academy._005_Garbage_Collection_composition;

import java.io.Serializable;

public class Employee extends Person implements Serializable {
    //Composition -> is a type of association in which a class can contain another class.
    private int employeeId;
    private Department department;
    private Gender gender;

    public Employee() {

    }

    public Employee(String name, int age, String email, int employeeId, Department department, Gender gender) {
        super(name, age, email);
        this.employeeId = employeeId;
        this.department = department;
        this.gender = gender;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", department=" + department +
                ", gender=" + gender +
                '}';
    }
}
