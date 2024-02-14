package J05034;

public class SinhVien implements Comparable<SinhVien>{

    private Integer Stt;
    private String Id,name, lop, email, incName;

    public SinhVien(Integer Stt, String Id, String name, String lop, String email, String incName) {
        this.Stt = Stt;
        this.Id = Id;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.incName = incName;
    }

    @Override
    public String toString() {
        return Stt + " " + Id + " " + name + " " + lop + " " + email + " " + incName;
    }

    @Override
    public int compareTo(SinhVien o) {
        return name.compareTo(o.name);
    }

    public String getIncName() {
        return incName;
    }
    
}
