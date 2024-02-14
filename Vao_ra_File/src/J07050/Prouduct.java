package J07050;

public class Prouduct implements Comparable<Prouduct>{

    private String id, name, group;
    private Double profit;

    public Prouduct(String id, String name, String group, Double purchasingPrice, Double sellingPrice) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.profit = sellingPrice - purchasingPrice;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + group + " " + String.format("%.2f", profit);
    }

    @Override
    public int compareTo(Prouduct o) {
        return o.profit.compareTo(profit);
    }
}
