package J07048;

public class SanPham implements Comparable<SanPham>{

    private String ID, name, han_bao_hanh;
    private int price;

    public SanPham(String ID, String name, String price, String han_bao_hanh) {
        this.ID = ID;
        this.name = name;
        this.han_bao_hanh = han_bao_hanh;
        this.price = Integer.parseInt(price);
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + price + " " + han_bao_hanh;
    }

    @Override
    public int compareTo(SanPham o) {
        if(price == o.price){
            return ID.compareTo(o.ID);
        }
        return o.price - price;
    }
    
    
    
}
