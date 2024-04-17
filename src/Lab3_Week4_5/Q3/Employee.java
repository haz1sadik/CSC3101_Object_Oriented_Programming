package Lab3_Week4_5.Q3;

public class Employee extends Person{

    private String employeeNum;
    private double basicSalary;

    public Employee(String name, String address, String email, int phoneNum, String employeeNum, double basicSalary){
        super(name, address, email, phoneNum);
        setEmployeeNum(employeeNum);
        setBasicSalary(basicSalary);
    }

    public String getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "\nEmployee\n" + super.toString() + "\nEmployee Number : " + getEmployeeNum() + "\nBasic Salary : " + getBasicSalary();
    }
}
