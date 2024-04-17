package Lab3_Week4_5.Q3;

public class Dependent extends Person{

    private String gender;
    private String birthDate;

    public Dependent(String name, String address, String email, int phoneNum, String gender, String birthDate){
        super(name, address, email, phoneNum);
        setGender(gender);
        setBirthDate(birthDate);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "\nDependent\n" + super.toString() + "\nGender : " + getGender() + "\nBirth Date : " + getBirthDate();
    }
}
