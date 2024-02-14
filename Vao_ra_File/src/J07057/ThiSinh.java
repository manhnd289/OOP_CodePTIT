package J07057;

public class ThiSinh implements Comparable<ThiSinh>{

    private String ID, name, dan_toc, status;
    private Double mark;
    private int region;
    
    private static double[] level = {0,1.5,1.0,0.0};
    
    private static String chuanHoa(String inp){
        String[] tmp = inp.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for(String item : tmp){
            sb.append(item.substring(0,1).toUpperCase());
            sb.append(item.substring(1));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public ThiSinh(String ID, String name, double mark, String dan_toc, int region) {
        this.ID = ID;
        this.name = chuanHoa(name);
        this.dan_toc = dan_toc;
        this.mark = mark;
        if(!dan_toc.equals("Kinh")) this.mark += 1.5f;
        this.region = region;
        this.mark += level[this.region];
        if(this.mark >= 20.5) this.status = "Do";
        else this.status = "Truot";
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + String.format("%.1f", mark) + " " + status;
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(mark.equals(o.mark)) return ID.compareTo(o.ID);
        return o.mark.compareTo(mark);
    }
    
    
    
}
