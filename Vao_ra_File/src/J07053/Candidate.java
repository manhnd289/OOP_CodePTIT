package J07053;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Candidate {

    private String Id, name, str_dob, status;
    private Date dob;
    private double mark_bonus;
    private int age, final_mark;
    
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private static String chuanHoa(String data){
        String[] tmp = data.trim().split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for(String item : tmp){
            sb.append(item.substring(0,1).toUpperCase() + item.substring(1).toLowerCase());
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public Candidate(String Id, String name, String dob, double mark_theory, double mark_practice) throws ParseException {
        
        this.Id = Id;
        this.name = chuanHoa(name);
        this.dob = sdf.parse(dob);
        this.str_dob = sdf.format(this.dob);
     
        this.age = 2021 - Integer.parseInt(this.str_dob.substring(6));
        
        if(mark_practice >= 8 && mark_theory >= 8) this.mark_bonus = 1;
        else if (mark_practice >= 7.5 && mark_theory >= 7.5) this.mark_bonus = 0.5;
        else this.mark_bonus = 0;
        
        this.final_mark = (int) Math.min(10, Math.round((mark_practice + mark_theory) / 2 + this.mark_bonus));
        
        if(this.final_mark == 9 || this.final_mark == 10) this.status = "Xuat sac";
        else if(this.final_mark == 8) this.status = "Gioi";
        else if(this.final_mark == 7) this.status = "Kha";
        else if(this.final_mark == 5 || this.final_mark == 6) this.status = "Trung binh";
        else this.status = "Truot";
        
    }

    @Override
    public String toString() {
        return Id + " " + name + " " + age + " " + final_mark + " " + status;
    }
    
    
    
}
