package J05010;

public class Mat_Hang implements Comparable<Mat_Hang>{

    private Integer Id;
    private String Name,Group;
    private Double sellingPrice, purchasePrice, profit;

    public Mat_Hang(Integer Id, String Name, String Group, Double purchasePrice, Double sellingPrice) {
        this.Id = Id;
        this.Name = Name;
        this.Group = Group;
        this.sellingPrice = sellingPrice;
        this.purchasePrice = purchasePrice;
        this.profit = this.sellingPrice - this.purchasePrice;
    }

    @Override
    public int compareTo(Mat_Hang o) {
        return -profit.compareTo(o.profit);
    }

    @Override
    public String toString() {
        return Id + " " + Name + " " + Group + " " + String.format(("%.2f"), profit);
    }
    
    
    
}
