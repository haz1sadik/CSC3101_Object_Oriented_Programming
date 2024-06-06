package Lab7_Week10_11.Q2;

public class ResizableCircle extends Circle implements resizable{
    public ResizableCircle(String color, double radius){
        super(color, radius);
    }
    public void resize(int percent){
        setRadius((percent/100.0) * getRadius());
    }
}
