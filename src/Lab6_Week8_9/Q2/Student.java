/*
 * Name : Muhammad Hazuan Bin Sadik
 * Matric Number : 223877
 */
package Lab6_Week8_9.Q2;

public class Student {

    //attribution declaration
    private int matricNum;
    private double test1, testLab, quiz, project, finalExam;

    //default constructor
    public Student(){
        setMatricNum(0);
        setTest1(0);
        setTestLab(0);
        setQuiz(0);
        setProject(0);
        setFinalExam(0);
    }

    //constructor with argument
    public Student(int matricNum, double test1, double testLab, double quiz, double project, double finalExam) {
        setMatricNum(matricNum);
        setTest1(test1);
        setTestLab(testLab);
        setQuiz(quiz);
        setProject(project);
        setFinalExam(finalExam);
    }

    //setters and getters method
    public int getMatricNum() {
        return matricNum;
    }

    public void setMatricNum(int matricNum) {
        this.matricNum = matricNum;
    }

    public double getTest1() {
        return test1;
    }

    public void setTest1(double test1) {
        this.test1 = test1;
    }

    public double getTestLab() {
        return testLab;
    }

    public void setTestLab(double testLab) {
        this.testLab = testLab;
    }

    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public double getProject() {
        return project;
    }

    public void setProject(double project) {
        this.project = project;
    }

    public double getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(double finalExam) {
        this.finalExam = finalExam;
    }

    //method to calculate total score
    public double totalScore(){
        return getTest1() + getTestLab() + getQuiz() + getProject() + getFinalExam();
    }

    //method to determine the grade based on the total score
    public String determineGrade(){
        if (totalScore() >= 80 && totalScore() <= 100){
            return "A";
        } else if (totalScore() >= 75 && totalScore() <= 79){
            return "A-";
        }else if (totalScore() >= 70 && totalScore() <= 74){
            return "B+";
        }else if (totalScore() >= 65 && totalScore() <= 69){
            return "B";
        }else if (totalScore() >= 60 && totalScore() <= 64){
            return "B-";
        }else if (totalScore() >= 55 && totalScore() <= 59){
            return "C+";
        }else if (totalScore() >= 50 && totalScore() <= 54){
            return "C";
        }else if (totalScore() >= 47 && totalScore() <= 49){
            return "C-";
        }else if (totalScore() >= 44 && totalScore() <= 46){
            return "D+";
        }else if (totalScore() >= 40 && totalScore() <= 43){
            return "D";
        }else if (totalScore() < 40){
            return "F";
        }else {
            System.out.println("Invalid Data");
            return "";
        }
    }

    //write to file string format
    @Override
    public String toString() {
        return getMatricNum() + "    " + getTest1() + "  " +  getTestLab() + "  " + getQuiz() + "  " +  getProject() + "  " +  getFinalExam() + "  " + determineGrade() + "\n";
    }
}
