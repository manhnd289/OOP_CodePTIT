package J05024;

public class Student {
    
    private String id, name, lop, email, carrer;

    public Student(String id, String name, String lop, String email) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
        
        String tmp = id.substring(3,7);
        if(tmp.equals("DCKT")) this.carrer = "KE TOAN";
        else if(tmp.equals("DCCN") && lop.charAt(0) != 'E') this.carrer = "CONG NGHE THONG TIN";
        else if(tmp.equals("DCAT") && lop.charAt(0) != 'E') this.carrer = "AN TOAN THONG TIN";
        else if(tmp.equals("DCVT")) this.carrer = "VIEN THONG";
        else if(tmp.equals("DCDT")) this.carrer = "DIEN TU";
        else this.carrer = "";
    }

    public String getCarrer() {
        return carrer;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + lop + " " + email;
    }

}
