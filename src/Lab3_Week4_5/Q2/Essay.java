package Lab3_Week4_5.Q2;

public class Essay extends GradeActivity{

    private int grammar, spelling, lengthCorrect, content;
    public Essay(int grammar, int spelling, int lengthCorrect, int content){
        setGrammar(grammar);
        setContent(content);
        setSpelling(spelling);
        setLengthCorrect(lengthCorrect);
    }
    public void setGrammar(int grammar){
        this.grammar = grammar;
    }
    public void setSpelling(int spelling){
        this.spelling= spelling;
    }
    public void setLengthCorrect(int lengthCorrect){
        this.lengthCorrect = lengthCorrect;
    }
    public void setContent(int content){
        this.content = content;
    }
    public int getGrammar(){
        return  this.grammar;
    }
    public int getSpelling() {
        return spelling;
    }
    public int getLengthCorrect() {
        return lengthCorrect;
    }
    public int getContent() {
        return content;
    }
    public void calcScore(){
        super.setScore(getGrammar() +  getContent() + getSpelling() + getLengthCorrect());
    }

    @Override
    public String toString() {
        calcScore();
        return "Essay " + super.toString();
    }
}
