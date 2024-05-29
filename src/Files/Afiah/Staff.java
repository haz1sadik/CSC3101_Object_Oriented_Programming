package Files.Afiah;

public class Staff extends Employee{
    private  String title;
    private int staffID;
    public Staff(int staffID){
        this.staffID = staffID;
    }
    public Staff(int staffID, String title, String office, double salary, MyDate dateHired, String name, String address, String email, int phoneNumber){
        super( office, salary, dateHired, name, address, email, phoneNumber);
        this.staffID = staffID;
        this.title  = title;
    }

    public String getTitle() {
        return title;
    }

    public int getStaffID() {
        return staffID;
    }

    @Override
    public boolean equals(Object obj) {
        Staff staff = (Staff) obj;
        if (staff.getStaffID() == this.staffID){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Staff " + super.toString() + "\nTitle : " + getTitle();
    }
}
