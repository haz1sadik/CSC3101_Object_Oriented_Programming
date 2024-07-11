package Final_Study.a;

public abstract class Employee implements Payable{
    private  String name;
    public Employee(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
