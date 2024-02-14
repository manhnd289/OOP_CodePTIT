package J07059;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CaThi implements Comparable<CaThi>{

    private String ID, time, IDroom;

    public CaThi(String ID, String time, String IDroom) {
        this.ID = ID;
        this.time = time;
        this.IDroom = IDroom;
    }
    
    public Date toDate() throws ParseException{
        return new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(time);
    }

    @Override
    public String toString() {
        return ID + " " + time + " " + IDroom;
    }

    public String getID() {
        return ID;
    }
    
    
    @Override
    public int compareTo(CaThi o) {
        try {
            if(this.toDate().equals(o.toDate())){
                return ID.compareTo(o.getID());
            }
            return this.toDate().compareTo(o.toDate());
        } catch (ParseException ex) {return 0;}
        
    }
    
    
    
}
