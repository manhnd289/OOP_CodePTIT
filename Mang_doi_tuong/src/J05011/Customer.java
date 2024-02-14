package J05011;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Customer implements Comparable<Customer>{

    private String id, name;
    private Long time;

    public Customer(String id, String name, String start, String end) {
        this.id = id;
        this.name = name;
        
        LocalTime start_time = LocalTime.of(Integer.parseInt(start.substring(0,2)), Integer.parseInt(start.substring(3)));
        LocalTime end_time = LocalTime.of(Integer.parseInt(end.substring(0,2)), Integer.parseInt(end.substring(3)));
        
        this.time = ChronoUnit.MINUTES.between(start_time, end_time);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + (time/60) + " gio " + (time%60) + " phut";
    }

    @Override
    public int compareTo(Customer o) {
        return (int)(o.time - time);
    }
    
    
    
}
