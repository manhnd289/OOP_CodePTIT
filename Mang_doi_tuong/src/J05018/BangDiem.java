package J05018;

public class BangDiem implements Comparable<BangDiem>{

    private String Id, name, rank = "";
    private Double ave;

    public BangDiem(String Id, String name, Double ave) {
        this.Id = Id;
        this.name = name;
        this.ave = ave;
        if(ave >= 9) this.rank = "XUAT SAC";
        else if(ave >= 8) this.rank = "GIOI";
        else if(ave >= 7) this.rank = "KHA";
        else if(ave >= 5) this.rank = "TB";
        else this.rank = "YEU";
    }

    @Override
    public String toString() {
        return Id + " " + name + " " + String.format("%.1f", Math.round(ave * 10) / 10.0) + " " + rank;
    }

    @Override
    public int compareTo(BangDiem o) {
        if(ave.equals(o.ave)){
            return Id.compareTo(o.Id);
        }else return -ave.compareTo(o.ave);
    }
    
}
