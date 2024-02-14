package J04013;

public class Candidate {

    private static double[] prio = {0.0 ,0.5, 1.0, 2.5};
    private String Id, name, status;
    private Double total_mark, prio_mark, final_mark;

    public Candidate(String Id, String name, Double mark1, Double mark2, Double mark3 ) {
        this.Id = Id;
        this.name = name;
        
        this.prio_mark = prio[Integer.parseInt(Id.substring(2, 3))];
        
        this.total_mark = mark1*2 + mark2 + mark3;
        this.final_mark = this.total_mark + this.prio_mark;
        
        this.status = (this.final_mark >= 24) ? "TRUNG TUYEN" : "TRUOT";
    }

    @Override
    public String toString() {
        return Id + " " + name + " " + (prio_mark.intValue() == prio_mark ? prio_mark.intValue() : String.format("%.1f", prio_mark)) + " " +
                (total_mark.intValue() == total_mark ? total_mark.intValue() : String.format("%.1f", total_mark)) + " " + status;
    }
    
    
    
}
