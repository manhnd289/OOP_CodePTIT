package J05006;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class NhanVien {

    private String Id, name, sex, dob, addr, taxNum, contract;
    
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public NhanVien(String Id, String name, String sex, String dob, String addr, String taxNum, String contract) throws ParseException {
        this.Id = Id;
        this.name = name;
        this.sex = sex;
        this.dob = sdf.format(sdf.parse(dob));
        this.addr = addr;
        this.taxNum = taxNum;
        this.contract = sdf.format(sdf.parse(contract));
    }

    @Override
    public String toString() {
        return Id + " " + name + " " + sex + " " + dob + " " + addr + " " + taxNum + " " + contract;
    }
    
}
