package J07034;

public class MonHoc implements Comparable<MonHoc>{

    private String ID, name, credit;

    public MonHoc(String ID, String name, String credit) {
        this.ID = ID;
        this.name = name;
        this.credit = credit;
    }

    @Override
    public int compareTo(MonHoc o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + credit;
    }
    
    
    
}
