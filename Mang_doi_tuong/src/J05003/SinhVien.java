package J05003;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SinhVien {

    private String Id = "", name = "", dob = "", lop = "";
    private Double gpa = 0.0;
   
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public SinhVien() { }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) throws ParseException {
        this.dob = sdf.format(sdf.parse(dob));
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return Id + " " + name + " " + lop + " " + dob + " " + String.format("%.2f", gpa);
    }
    
}
