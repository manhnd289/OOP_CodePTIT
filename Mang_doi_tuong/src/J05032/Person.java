package J05032;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements Comparable<Person>{

    private String name;
    private Date dob;
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Person(String name, String dob) throws ParseException {
        this.name = name;
        this.dob = sdf.parse(dob);
    }

    @Override
    public int compareTo(Person o) {
        return dob.compareTo(o.dob);
    }

    @Override
    public String toString() {
        return name;
    }
    
    
    
}

