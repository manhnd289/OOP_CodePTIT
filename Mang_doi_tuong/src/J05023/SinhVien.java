
package J05023;

public class SinhVien {

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

    public String getLop() {
        return lop;
    }
    
}
