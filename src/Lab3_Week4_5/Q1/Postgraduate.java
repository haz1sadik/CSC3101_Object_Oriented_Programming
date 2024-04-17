package Lab3_Week4_5.Q1;

public class Postgraduate extends Student{
    private String thesisName;

    public Postgraduate(int matricNum, String name, String email, double gpa, String thesisName){
        super(matricNum, name, email, gpa);
        setThesisName(thesisName);
    }

    public String getThesisName() {
        return thesisName;
    }

    public void setThesisName(String thesisName) {
        this.thesisName = thesisName;
    }

    @Override
    public String toString() {
        return "\nPostgraduate " + super.toString() + "\nThesis : " + getThesisName();
    }
}
