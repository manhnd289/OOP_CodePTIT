package J07084;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class Student implements Comparable<Student>{

    private String name;
    private Long minutes;
    
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Student(String name, String start, String end) throws ParseException {
        this.name = name;
        Long time = sdf.parse(end).getTime() - sdf.parse(start).getTime();
        this.minutes = TimeUnit.MILLISECONDS.toMinutes(time);
    }

    @Override
    public String toString() {
        return name + " " + minutes;
    }

    @Override
    public int compareTo(Student o) {
        if(o.minutes == minutes){
            return name.compareTo(o.name);
        }return (int)(o.minutes - minutes);
    }
    
    
    
}
