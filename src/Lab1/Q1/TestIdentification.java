package Lab1.Q1;

public class TestIdentification{
    public static void main(String[] args) {
        Identification person1 = new Identification("Nor Fazlida", 'f', "fazlida@upm.edu.my");
        System.out.println("Name is : " + person1.getName());
        System.out.println("Gender is : " + person1.getGender());
        System.out.println("Email is : " + person1.getEmail());
        System.out.println(person1.toString());
        person1.setEmail("fazlida@gmail.com");
        System.out.println(person1.toString());
    }
}
