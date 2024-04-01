package Lab1_Week1.Q1;
public class Identification {
    String name, email;
    char gender;

    public Identification(String name, char gender, String email){
        this.name = name;
        this.gender = gender;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return this.name + " (" + this.gender + ") at " + this.email;
    }
}
