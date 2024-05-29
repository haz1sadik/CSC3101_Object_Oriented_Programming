package Files.Suha;

public class Student {

    private int idStudent;
    private String name;
    private String department;
    private String classification;

    //default constructor
    public Student() {
        this.idStudent = 0;
        this.name = " ";
        this.department = " ";
        this.classification = " ";
    }

    // Constructor accepting all fields
    public Student(int idStudent, String name,String department, String classification) {
        this.idStudent=idStudent;
        this.name=name;
        this.department=department;
        this.classification=classification;
    }

    // Constructor accepting idStudent, name, and department, but sets classification to an empty string
    //It accepts three parameters
    public Student(int idStudent, String name) {
        this.idStudent=idStudent;
        this.name=name;
        this.department=department;
        this.classification= " ";
    }

    public int getIdStudent() {
        return idStudent;
    }
    public void setIdStudent(int idStudent) {
        this.idStudent=idStudent;
    }

    public String getname() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department=department;
    }

    public String getClassification() {
        return classification;
    }
    public void setClassification(String classification) {
        this.classification=classification;
    }
}