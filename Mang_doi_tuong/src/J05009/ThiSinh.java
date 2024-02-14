package J05009;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ThiSinh implements Comparable<ThiSinh>{

    private Integer Id;
    private String name, dob;
    private Double mark1, mark2, mark3, total;

    public ThiSinh(Integer Id, String name, String dob, Double mark1, Double mark2, Double mark3) throws ParseException {
        this.Id = Id;
        this.name = name;
        this.dob = dob;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.total = mark1 + mark2 + mark3;
    }

    @Override
    public String toString() {
        return Id + " " + name + " " + dob + " " + total;
    }

    public Double getTotal() {
        return total;
    }
    
    @Override
    public int compareTo(ThiSinh o) {
        if(total.equals(o.total)){
            return Id.compareTo(o.Id);
        }return total.compareTo(o.total);
    }
}
