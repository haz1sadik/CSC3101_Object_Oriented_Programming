package Lab3_Week4_5.Q1;

public class Undergraduate extends Student {
    private String classification;

    public Undergraduate(){

    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public String toString() {
        return super.toString() + "\nClassification : " + getClassification();
    }
}
