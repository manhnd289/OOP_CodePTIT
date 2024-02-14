package J07037;

public class DoanhNghiep implements Comparable<DoanhNghiep>{

    private String ID, name;
    private int amount;

    public DoanhNghiep(String ID, String name, String amount) {
        this.ID = ID;
        this.name = name;
        this.amount = Integer.parseInt(amount);
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + amount;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        return ID.compareTo(o.ID);
    }
    
}
