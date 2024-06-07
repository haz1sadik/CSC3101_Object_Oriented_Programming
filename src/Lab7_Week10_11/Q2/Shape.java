/*
 * Name : MUHAMMAD HAZUAN BIN SADIK
 * Matric Number : 223877
 */
package Lab7_Week10_11.Q2;

public abstract class Shape {

    //Attributions declaration
    private String color;
    public Shape(String color){
        setColor(color);
    } //Constructor
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
