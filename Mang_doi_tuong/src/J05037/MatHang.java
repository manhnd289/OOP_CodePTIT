package J05037;

public class MatHang implements Comparable<MatHang>{

    private String Id, name, unit;
    private int purchase_Price, amount, ship_fee, selling_Price;
    private int retail_Price;

    public MatHang(String Id, String name, String unit, int purchase_Price, int amount) {
        this.Id = Id;
        this.name = name;
        this.unit = unit;
        this.purchase_Price = purchase_Price;
        this.amount = amount;
        this.ship_fee = (int) (Math.round(0.05 * purchase_Price * amount));
        this.selling_Price = purchase_Price * amount + this.ship_fee;
        this.retail_Price = (int) Math.ceil((this.selling_Price * 1.02 / this.amount) / 100) * 100;
    }

    @Override
    public String toString() {
        return Id + " " + name + " " + unit + " " + ship_fee + " " + selling_Price + " " + retail_Price;
    }

    @Override
    public int compareTo(MatHang o) {
        return (int)(o.retail_Price - retail_Price);
    }
    
    
    
}
