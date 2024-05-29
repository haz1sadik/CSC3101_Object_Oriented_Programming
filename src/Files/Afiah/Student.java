package Files.Afiah;

public class Student extends Person{
    private final String status;
    public Student(){
        super();
        this.status = " ";
    }
    public Student(String status, String name, String address, String email, int phoneNumber){
        super(name, address, email, phoneNumber);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "\nStudent" + super.toString() + "\nStatus : " + getStatus();
    }
}
