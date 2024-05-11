package Afiah;

public class TestProgram {
    public static void main(String[] args) {
        //Objects creation
        Person person = new Person("Afiah", "Sekinchan", "kene2tehlu@gmail.com", 999);
        Person student = new Student("Freshman", "Suha", "Meru", "anakencikirwan@icloud.com", 911);
        MyDate hired = new MyDate(29,4, 2019);
        Person staff = new  Employee("Selangor", 12000.00, hired , "Arumugam", "Besut", "arumugam@upm.com.my", 123456);
        DisplayDetailsInformation(person);
        DisplayDetailsInformation(staff);
        DisplayDetailsInformation(student);

    }
    //Display Methods
    public static void DisplayDetailsInformation(Person person){
        if (person instanceof Employee) {
            Employee employee = (Employee) person;
            System.out.println(employee);
        } else if (person instanceof Student) {
            Student student = (Student) person;
            System.out.println(student);
        } else if (person instanceof Staff) {
            Staff staff = (Staff) person;
            System.out.println(staff);
        } else if (person instanceof Faculty) {
            Faculty faculty = (Faculty) person;
            System.out.println(faculty);
        } else {
            System.out.println("Person" + person.toString());
        }
    }
}
