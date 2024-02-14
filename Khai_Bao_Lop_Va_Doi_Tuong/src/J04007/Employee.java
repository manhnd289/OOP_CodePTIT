package J04007;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Employee {

    private String id, name, sex, dob, add, taxNum, doc;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

    public Employee(String id, String name, String sex, String dob, String add, String taxNum, String doc) throws ParseException {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.dob = sdf.format(sdf.parse(dob));
        this.add = add;
        this.taxNum = taxNum;
        this.doc = sdf.format(sdf.parse(doc));
    }

    @Override
    public String toString() {
        return id + " " + name + " " + sex + " " + dob + " " + add + " " + taxNum + " " + doc;
    }
    
    
    
}
