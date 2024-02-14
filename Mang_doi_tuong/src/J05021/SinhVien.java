
package J05021;

public class SinhVien implements Comparable<SinhVien>{

    private String ID, name, lop, email;

    public SinhVien(String ID, String name, String lop, String email) {
        this.ID = ID;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + lop + " " + email;
    }

    @Override
    public int compareTo(SinhVien o) {
        return ID.compareTo(o.ID);
    }
    
    
    
}
