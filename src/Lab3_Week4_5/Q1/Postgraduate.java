package Lab3_Week4_5.Q1;

public class Postgraduate extends Student{
    private String thesisName;

    public Postgraduate(){

    }

    public String getThesisName() {
        return thesisName;
    }

    public void setThesisName(String thesisName) {
        this.thesisName = thesisName;
    }

    @Override
    public String toString() {
        return super.toString() + "\nThesis : " + getThesisName();
    }
}
