package Lab3_Week4_5.Q1;

public class Postgraduate extends Student{
    private String thesisName;

    public String getThesisName() {
        return thesisName;
    }

    public void setThesisName(String thesisName) {
        this.thesisName = thesisName;
    }

    @Override
    public String toString() {
        return "Student " + "\nMatric : " + getMatricNum() + "\nName : " + getName() + "E-mail : " + getEmail() + "\nGPA : " + getGpa() + "Thesis : " + getThesisName();
    }
}
