package J07033;

public class SinhVien implements Comparable<SinhVien>{

    private String msv, name, lop, email;
    
    private static String chuanHoa(String inp){
        String[] tmp = inp.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for(String item : tmp){
            sb.append(item.substring(0,1).toUpperCase() + item.substring(1) + " ");
        }
        return sb.toString();
    }

    public SinhVien(String msv, String name, String lop, String email) {
        this.msv = msv;
        this.name = chuanHoa(name);
        this.lop = lop;
        this.email = email;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.msv.compareTo(o.msv);
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + lop + " " + email;
    }
  
}
