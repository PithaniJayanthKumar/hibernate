package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "student_001")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roll_number")
    private int rollNumber;

    @Column(name = "name", nullable = false)
    private String name;

    // Constructors
    public Student() {}

    public Student(String name) {
        this.name = name;
    }

    // Getters and Setters
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [Roll Number=" + rollNumber + ", Name=" + name + "]";
    }
}
