package J05029;

public class DoanhNghiep implements Comparable<DoanhNghiep>{

    private String Id, name;
    private Integer amount;

    public DoanhNghiep(String Id, String name, Integer amount) {
        this.Id = Id;
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return Id + " " + name + " " + amount;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        if(amount.equals(o.amount)){
            return Id.compareTo(o.Id);
        }return -amount.compareTo(o.amount);
    }

    public Integer getAmount() {
        return amount;
    }
    
    
}
