package J05081;

public class MatHang implements Comparable<MatHang>{

    private String id, name, unit;
    private long mua, ban,profit;

    public MatHang(String id, String name, String unit, String mua, String ban) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.mua = Long.parseLong(mua);
        this.ban = Long.parseLong(ban);
        this.profit = this.ban - this.mua;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + unit + " " + mua + " " + ban + " " + profit ;
    }

    @Override
    public int compareTo(MatHang o) {
        int res = (int)(o.profit - profit);
        if(res==0) id.compareTo(o.id);
        return res;
    }
    
}
