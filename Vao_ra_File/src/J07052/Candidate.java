package J07052;

public class Candidate implements Comparable<Candidate>{

    private String id, name;
    private Double sum_mark, priority_mark;
    
    private static Double[] priority = {0.0, 0.5, 1.0, 2.5};
    
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

    public Candidate(String id, String name, Double math, Double physics, Double chemistry) {
        this.id = id;
        this.priority_mark = Candidate.priority[Integer.parseInt(id.substring(2,3))];
        this.name = chuanHoa(name);
        this.sum_mark = math*2 + physics + chemistry + this.priority_mark;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + (priority_mark == priority_mark.intValue() ? priority_mark.intValue() : String.format("%.1f", priority_mark)) + " " + (sum_mark == sum_mark.intValue() ? sum_mark.intValue() : String.format("%.1f", sum_mark));
    }

    @Override
    public int compareTo(Candidate o) {
        if(o.sum_mark.equals(sum_mark)){
            return id.compareTo(o.id);
        } return o.sum_mark.compareTo(sum_mark);
    }

    public Double getSum_mark() {
        return sum_mark;
    }
    
}
