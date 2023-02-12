public class Weightproduct extends Product{

    private double weight;


    public Weightproduct(String name, double cost, double weight) {
        super(name, cost);
        this.weight = weight;
    }

    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder(super.toString());
        localString.append(String.format(" вес %s", weight));
        return localString.toString();
    }
}
