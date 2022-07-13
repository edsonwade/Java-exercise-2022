package mindswap.academy._005_Garbage_Collection_composition;

import java.io.Serializable;

public class Teacher extends Person implements Serializable {

    private int teacherId;
    private Department department;
    private Gender gender;

    public Teacher() {

    }

    public Teacher(String name, int age, String email, int teacherId, Department department, Gender gender) {
        super(name, age, email);
        this.teacherId = teacherId;
        this.department = department;
        this.gender = gender;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
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
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", department=" + department +
                ", gender=" + gender +
                '}';
    }
}
