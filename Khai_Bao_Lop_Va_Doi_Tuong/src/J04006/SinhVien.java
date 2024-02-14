package J04006;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SinhVien {

    private String msv, name, lop, dob;
    private float gpa;

    public SinhVien(String msv, String name,String lop, String dob, float gpa) throws ParseException {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        this.dob = sdf.format(sdf.parse(dob));
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return  msv + " " + name + " " + lop + " " + dob + " " + String.format("%.2f", gpa);
    }
    
}
