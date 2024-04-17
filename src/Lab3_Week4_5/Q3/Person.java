package Lab3_Week4_5.Q3;

public class Person {
    private String name, address, email;
    private int phoneNum;

    public Person(String name, String address, String email, int phoneNum) {
        setName(name);
        setAddress(address);
        setEmail(email);
        setPhoneNum(phoneNum);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "\nName : " + getName() + "\nAddress : " + getAddress() + "\nEmail : " + getEmail() + "\nPhone : " + getPhoneNum();
    }
}
