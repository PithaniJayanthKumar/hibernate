package entities;

public class Student {
    private int rollNumber;
    private String name;

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

    // Constructor
    public Student() {}

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [Roll Number=" + rollNumber + ", Name=" + name + "]";
    }
}
