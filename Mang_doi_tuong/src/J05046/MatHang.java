package J05046;

public class MatHang {

    private String Id = "", name;
    private int amount, unit_price, final_Price, discount, total;
    private double percentage;

    public MatHang(String id,String name, int amount, int unit_price) {
        this.name = name;
        this.amount = amount;
        this.unit_price = unit_price;
        this.Id  = id;
        
        if(amount > 10) percentage = 0.05;
        else if(amount >= 8) percentage = 0.02;
        else if(amount >= 5) percentage = 0.01;
        else percentage = 0;
        
        this.total = this.unit_price * this.amount;
        this.discount = (int) (this.total * this.percentage);
        
        this.final_Price = this.total - this.discount;
        
    }

    @Override
    public String toString() {
        return Id + " " + name + " " + discount + " " + final_Price;
    }
    
    
    
}
