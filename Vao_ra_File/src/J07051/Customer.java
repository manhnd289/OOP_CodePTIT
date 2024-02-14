package J07051;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class Customer implements Comparable<Customer>{

    private String id_cus, name, id_room;
    private Long time, total_Price;
    
    private static int[] unit_price = {0, 25, 34, 50, 80};
    
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private static String chuanHoa(String name){
        String[] tmp = name.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for(String item : tmp){
            sb.append(item.substring(0,1).toUpperCase());
            sb.append(item.substring(1));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public Customer(String id_cus, String name, String id_room, String start, String end, Integer service) throws ParseException {
        this.id_cus = id_cus;
        this.name = chuanHoa(name);
        this.id_room = id_room;
        this.time = TimeUnit.MILLISECONDS.toDays(sdf.parse(end).getTime() - sdf.parse(start).getTime()) + 1;
        this.total_Price = unit_price[Integer.parseInt(id_room.substring(0,1))]*this.time + service;
    }

    @Override
    public String toString() {
        return id_cus + " " + name + " " + id_room + " " + time + " " + total_Price;
    }

    @Override
    public int compareTo(Customer o) {
        return (int)(o.total_Price - total_Price);
    }
    
    
    
}
