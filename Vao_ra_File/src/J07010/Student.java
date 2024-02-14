package J07010;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Student {

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private String Id, name, lop, dob;
    private Double gpa;

    public Student(String Id, String name, String lop, String dob, Double gpa) throws ParseException {
        this.Id = Id;
        this.name = name;
        this.lop = lop;
        this.dob = sdf.format(sdf.parse(dob));
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return Id + " " + name + " " + lop + " " + dob + " " + String.format("%.2f", gpa);
    }
    
    
    
}
