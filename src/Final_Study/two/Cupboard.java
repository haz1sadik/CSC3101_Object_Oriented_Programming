package Final_Study.two;

public class Cupboard extends ExportFurniture implements Maintenance, Comparable{
    int weight;
    public Cupboard(){}
    public Cupboard(int weight) {
        this.weight = weight;
    }
    public String howToMaintain() {
        return "Maintain Cupboard";
    }
    public int compareTo(Object o) {
        return weight-((Cupboard)o).weight;
    }
}
