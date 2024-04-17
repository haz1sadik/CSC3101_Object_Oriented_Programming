package Lab3_Week4_5.Q2;

public class TestEssay {
    public static void main(String[] args) {
        GradeActivity simpleGrade = new GradeActivity(59);
        GradeActivity essayGrade = new Essay(25, 17, 16, 25);

        System.out.println(simpleGrade);
        System.out.println("\n" + essayGrade);
    }
}
