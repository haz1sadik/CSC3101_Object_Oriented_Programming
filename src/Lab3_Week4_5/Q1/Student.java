package Lab3_Week4_5.Q1;

public class Student {
    private int matricNum;
    private String name, email;
    private double gpa;

    public Student(int matricNum, String name, String email, double gpa) {
        this.matricNum = matricNum;
        this.name = name;
        this.email = email;
        this.gpa = gpa;
    }

    public Student() {

    }

    public int getMatricNum() {
        return matricNum;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


    public double getGpa() {
        return gpa;
    }

    public void setMatricNum(int matricNum) {
        this.matricNum = matricNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student " + "\nMatric : " + getMatricNum() + "\nName : " + getName() + "\nEmail : " + getEmail() + "\nGPA : " + getGpa();
    }
}
