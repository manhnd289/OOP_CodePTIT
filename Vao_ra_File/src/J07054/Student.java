package J07054;

import java.util.ArrayList;

public class Student implements Comparable<Student>{

    private String id, name;
    private Double mark;
    public static ArrayList<Double> arr_mark = new ArrayList<>();
    
    private static String chuanHoa(String name){
        String[] tmp = name.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for(String item: tmp){
            sb.append(item.substring(0,1).toUpperCase());
            sb.append(item.substring(1));
            sb.append(" ");
        }
        return sb.toString().trim();
     }

    public Student(String id, String name, Integer mark1, Integer mark2, Integer mark3) {
        this.id = id;
        this.name = chuanHoa(name);
        this.mark = Math.round((mark1*3 + mark2*3 + mark3*2) / 8.0 * 100.0) / 100.0;
        arr_mark.add(this.mark);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.2f", mark) + " " + (arr_mark.indexOf(mark)+1);
    }

    @Override
    public int compareTo(Student o) {
        if(o.mark.equals(mark)){
            return id.compareTo(o.id);
        }return o.mark.compareTo(mark);
    }
}
