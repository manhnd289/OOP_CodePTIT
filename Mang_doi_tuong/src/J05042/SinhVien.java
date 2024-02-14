package J05042;

public class SinhVien implements Comparable<SinhVien>{

    private String name;
    private int ac_ex, sub_ex;

    public SinhVien(String name, int ac_ex, int sub_ex) {
        this.name = name;
        this.ac_ex = ac_ex;
        this.sub_ex = sub_ex;
    }

    @Override
    public String toString() {
        return name + " " + ac_ex + " " + sub_ex;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(ac_ex == o.ac_ex){
            if(sub_ex == o.sub_ex){
                return name.compareTo(o.name);
            }else return sub_ex - o.sub_ex;
        }else return o.ac_ex - ac_ex;
    }
    
    
    
}
