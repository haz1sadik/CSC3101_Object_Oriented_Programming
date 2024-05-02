package Afiah;

public class Faculty extends Employee{
    private int officeHours;
    private String rank;
    public Faculty(){
        super();
    }
    public Faculty(int officeHours, String rank, String office, double salary, MyDate dateHired, String name, String address, String email, int phoneNumber){
        super(office, salary, dateHired, name, address, email, phoneNumber);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Faculty " + super.toString() + "\nOffice Hours : " + getOfficeHours() + "\nRank : " + getRank();
    }
}
