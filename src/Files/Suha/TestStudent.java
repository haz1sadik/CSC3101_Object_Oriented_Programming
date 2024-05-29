package Files.Suha;

public class TestStudent {

    public static void main(String []args) {

        // Create an array to hold Student objects
        Student[] studentArray = new Student[4];

        // Initialize array with Student objects
        studentArray [0] = new Student (1198100, "Ghazali Ali","Computer Science", "Freshman");
        studentArray [1] = new Student (1057840, "Abdul Rahman", "Multimedia","Junior");
        studentArray [2] = new Student (1001198, "Abdul Majid", "Network",  "Senior");
        studentArray [3] = new Student (1002063, "Zainab", "Softwware Engineering" , "Sophomore");

        Student hehe = new Student();
        System.out.println(hehe.getname());

        for (int i=0; i<4; i++) {
            System.out.println("Student " + (i+1));
            System.out.println("Id Student: " +studentArray[i].getIdStudent());
            System.out.println("Name: " +studentArray[i].getname());
            System.out.println("Department: " +studentArray[i].getDepartment());
            System.out.println("Classification: " +studentArray[i].getClassification());
            System.out.println();
        }
    }
}