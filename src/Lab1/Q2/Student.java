package Lab1.Q2;

public class Student {
    int idStudent;
    String name, major, classification;
    Student(int idStudent, String name, String major, String classification){
        this.idStudent = idStudent;
        this.name = name;
        this.major = major;
        this.classification = classification;
    }
    Student(int idStudent, String name, String major){
        this.idStudent = idStudent;
        this.name = name;
        this.major = major;
        this.classification = "";
    }
    Student(){
        this.idStudent = 0;
        this.name = "";
        this.major = "";
        this.classification = "";
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public String getClassification() {
        return classification;
    }
}
