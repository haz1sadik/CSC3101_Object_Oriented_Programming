package Lab3_Week4_5.Q2;

public class GradeActivity {
    private int score;
    public GradeActivity(int score){
        setScore(score);
    }
    public GradeActivity(){}
    public void setScore(int score){
        this.score = score;
    }
    public int getScore(){
        return this.score;
    }
    public char getGrade(int score){
        if (score >= 90 && score <= 100)
            return 'A';
        else if (score >= 80 && score < 90)
            return 'B';
        else if (score >= 70 && score < 80)
            return 'C';
        else if (score >= 60 && score < 70)
            return 'D';
        else if (score >= 0 && score < 60)
            return 'F';
        else
            return ' ';
    }
    @Override
    public String toString(){
        return "Score is : " + getScore() + "\nGrade : " + getGrade(this.score);
    }
}
