package J07055;

public class Student implements Comparable<Student>{

    private String ID, name, rank;
    private Double ave_mark;
    
    private static String chuanHoa(String inp){
        String[] tmp = inp.trim().split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for(String item : tmp){
            sb.append(item.substring(0,1).toUpperCase());
            sb.append(item.substring(1).toLowerCase());
            sb.append((" "));
        }
        return sb.toString().trim();
    }

    public Student(String ID, String name, int mark1, int mark2, int mark3) {
        this.ID = ID;
        this.name = chuanHoa(name);
        this.ave_mark = 0.25 * mark1 + 0.35 * mark2 + 0.4 * mark3;
        if(this.ave_mark >= 8) this.rank = "GIOI";
        else if(this.ave_mark >= 6.5) this.rank = "KHA";
        else if(this.ave_mark >= 5) this.rank = "TRUNG BINH";
        else this.rank = "KEM";
    }

    @Override
    public int compareTo(Student o) {
        return o.ave_mark.compareTo(ave_mark);
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + String.format("%.2f", ave_mark) + " " + rank;
    }
    
    
    
}
