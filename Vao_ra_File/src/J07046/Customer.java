package J07046;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class Customer implements Comparable<Customer>{

    private String id_cus, name, id_room;
    private Long time;
    
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Customer(String id_cus, String name, String id_room, String start, String end) throws ParseException {
        this.id_cus = id_cus;
        this.name = name;
        this.id_room = id_room;
        this.time = TimeUnit.MILLISECONDS.toDays(sdf.parse(end).getTime() - sdf.parse(start).getTime());
    }

    @Override
    public String toString() {
        return id_cus + " " + name + " " + id_room + " " + time;
    }

    @Override
    public int compareTo(Customer o) {
        return (int)(o.time - time);
    }
    
    
    
}
