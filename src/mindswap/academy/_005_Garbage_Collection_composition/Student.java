package mindswap.academy._005_Garbage_Collection_composition;

import java.io.Serializable;

public class Student extends Person implements Serializable {
    int studentId;
    Department department;
    Gender gender;

    public Student() {
    }

    public Student(String name, int age, String email, int studentId, Department department, Gender gender) {
        super(name, age, email);
        this.studentId = studentId;
        this.department = department;
        this.gender = gender;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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
        return "Student{" +
                "studentId=" + studentId +
                ", department=" + department +
                ", gender=" + gender +
                '}';
    }
}
