package J05082;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer implements Comparable<Customer>{

    private String Id, name, sex, str_dob, addr;
    private Date dob;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private static String chuanHoa(String inp){
        String[] tmp = inp.trim().split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for(String item : tmp){
            sb.append(item.substring(0,1).toUpperCase());
            sb.append(item.substring(1).toLowerCase());
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public Customer(String Id, String name, String sex, String dob, String addr) throws ParseException {
        this.Id = Id;
        this.sex = sex;
        this.dob = sdf.parse(dob);
        this.str_dob = sdf.format(this.dob);
        this.addr = addr;
        this.name = chuanHoa(name);
    }

    @Override
    public String toString() {
        return Id + " " + name + " " + sex + " " + addr + " " + str_dob;
    }

    @Override
    public int compareTo(Customer o) {
        return dob.compareTo(o.dob);
    }
    
    
    
}
