package J05036;

public class MatHang {

    private String Id, name, unit;
    private int purchase_Price, ship_Fee, sell_Price, final_Price;
    private int amount;

    public MatHang(String Id, String name, String unit, int purchase_Price, int amount) {
        this.Id = Id;
        this.name = name;
        this.unit = unit;
        this.purchase_Price = purchase_Price;
        this.amount = amount;
        this.ship_Fee = (int) (Math.round(purchase_Price * amount * 0.05));
        this.sell_Price = this.purchase_Price * this.amount + this.ship_Fee;
        this.final_Price = (int) (Math.round(this.sell_Price * 1.02));
    }

    @Override
    public String toString() {
        return Id + " " + name + " " + unit + " " + ship_Fee + " " + sell_Price + " " + final_Price;
    }
    
    
}
