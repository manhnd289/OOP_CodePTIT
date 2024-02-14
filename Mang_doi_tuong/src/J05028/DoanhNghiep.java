package J05028;

public class DoanhNghiep implements Comparable<DoanhNghiep>{

    private String Id, name;
    private Integer Amount;

    public DoanhNghiep(String Id, String name, Integer Amount) {
        this.Id = Id;
        this.name = name;
        this.Amount = Amount;
    }

    @Override
    public String toString() {
        return Id + " " + name + " " + Amount;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        if(Amount.equals(o.Amount)){
            return Id.compareTo(o.Id);
        }return -Amount.compareTo(o.Amount);
    }
    
}
