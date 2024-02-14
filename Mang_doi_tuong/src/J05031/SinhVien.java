package J05031;

public class SinhVien implements Comparable<SinhVien>{

    private String Id, name, lop;
    private Double mark1, mark2, mark3;

    public SinhVien(String Id, String name, String lop, Double mark1, Double mark2, Double mark3) {
        this.Id = Id;
        this.name = name;
        this.lop = lop;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    @Override
    public String toString() {
        return Id + " " + name + " " + lop + " " + String.format("%.1f", mark1) + " " + String.format("%.1f", mark2) + " " + String.format("%.1f", mark3);
    }

    @Override
    public int compareTo(SinhVien o) {
        return name.compareTo(o.name);
    }
    
}
