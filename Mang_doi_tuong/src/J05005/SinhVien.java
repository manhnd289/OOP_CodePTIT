package J05005;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SinhVien implements Comparable<SinhVien>{

    private String Id, name, lop, dob;
    private Double gpa;
    
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private static String chuanHoa(String inp){
        String[] tmp = inp.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for(String item : tmp){
            sb.append(item.substring(0,1).toUpperCase());
            sb.append(item.substring(1));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public SinhVien(String Id, String name, String lop, String dob, Double gpa) throws ParseException {
        this.Id = Id;
        this.name = chuanHoa(name);
        this.lop = lop;
        this.dob = sdf.format(sdf.parse(dob));
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return Id + " " + name + " " + lop + " " + dob + " " + String.format("%.2f", gpa);
    }

    @Override
    public int compareTo(SinhVien o) {
        return -gpa.compareTo(o.gpa);
    }
    
}
