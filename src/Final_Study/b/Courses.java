package Final_Study.b;

public class Courses {
    String code, name;
    int quota;

    public Courses(String code, String name, int quota) {
        this.code = code;
        this.name = name;
        this.quota = quota;
    }
    String checkQuota(){
        if (quota > 100){
            return "CANNOT REGISTER : EXCEED QUOTA";
        } else if (quota > 50) {
            return "DEWAN BESAR OR SEMINAR ROOM for " + quota + " students";
        } else if (quota > 10) {
            return "DKAP ROOM for " + quota + " students";
        }else {
            return "NO STUDENT REGISTER";
        }
    }
}
