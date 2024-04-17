package Lab3_Week4_5.Q1;

public class Undergraduate extends Student {
    private String classification;

    public Undergraduate(int matricNum, String name, String email, double gpa, String classification){
        super(matricNum, name, email, gpa);
        setClassification(classification);
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public String toString() {
        return "\nUndergraduate " + super.toString() + "\nClassification : " + getClassification();
    }
}
