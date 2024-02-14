package J04005;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SinhVien {

    private String name;
    private LocalDate dob;
    private float mon1,mon2,mon3,sum;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public SinhVien(String name, String dob, String mon1, String mon2, String mon3) {
        this.name = name;
        
        this.dob = LocalDate.parse(dob, formatter);
        this.mon1 = Float.parseFloat(mon1);
        this.mon2 = Float.parseFloat(mon2);
        this.mon3 = Float.parseFloat(mon3);
        this.sum = this.mon1 + this.mon2 + this.mon3;
    }

    @Override
    public String toString() {
        return name + " " + dob.format(formatter) + " " + sum;
    }
}
