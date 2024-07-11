package Final_Study.two;

public class TestFurniture {
    public static void main(String[] args) {
        Object[] objects = {new Cupboard(), new Shelf(), new
                Desk(), new Table()};
        for (int i = 0; i < objects.length; i++)
            showObject(objects[i]);
    }
    public static void showObject(Object object) {
        if (object instanceof Maintenance)
            System.out.println(((Maintenance)object).howToMaintain());
    }
}
