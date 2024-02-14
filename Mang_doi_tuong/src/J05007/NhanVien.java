package J05007;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien implements Comparable<NhanVien>{

    private String ID, name, sex, dob, addr, taxNum, contract;
    private Date tmp1;
    
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public NhanVien(String ID, String name, String sex, String dob, String addr, String taxNum, String contract) throws ParseException {
        this.ID = ID;
        this.name = name;
        this.sex = sex;
        this.dob = sdf.format(sdf.parse(dob));
        this.addr = addr;
        this.taxNum = taxNum;
        this.contract = sdf.format(sdf.parse(contract));
        this.tmp1 = sdf.parse(dob);
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + sex + " " + dob + " " + addr + " " + taxNum + " " + contract;
    }

    @Override
    public int compareTo(NhanVien o) {
        return tmp1.compareTo(o.tmp1);
    }
    
}
