package Afiah;

public class Person {
    private String name, address, email;
    private int phoneNumber;
    public Person(){
        this.name = " ";
        this.address = " ";
        this.email = " ";
        this.phoneNumber = 0;
    }
    public Person(String name, String address, String email, int phoneNumber){
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    //public boolean equals(Person person){
       // if ()
    //}
    @Override
    public String toString() {
        return "\nName : " + getName() + "\nAddress : " + getAddress() + "\nEmail : " + getEmail() + "\nPhone Number : " + getPhoneNumber();
    }
}
