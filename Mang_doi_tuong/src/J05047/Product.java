package J05047;

public class Product implements Comparable<Product>{

    private String Id, name;
    private int amount, unit_price, total_price, discount, final_price;
    private double perc_discount;

    public Product(String Id, String name, int amount, int unit_price) {
        this.Id = Id;
        this.name = name;
        this.amount = amount;
        this.unit_price = unit_price;
        this.total_price = amount * unit_price;
        
        if(amount > 10) perc_discount = 0.05;
        else if(amount >= 8) perc_discount = 0.02;
        else if(amount >= 5) perc_discount = 0.01;
        else this.perc_discount = 0;
        
        this.discount = (int) (this.total_price * this.perc_discount);
        this.final_price = this.total_price - this.discount;
    }

    @Override
    public int compareTo(Product o) {
        return o.discount - discount;
    }

    @Override
    public String toString() {
        return Id + " " + name + " " + discount + " " + final_price;
    }
    
    
    
}
