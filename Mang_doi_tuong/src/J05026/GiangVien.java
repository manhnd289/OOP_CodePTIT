package J05026;

public class GiangVien {

    private String ID, name, BoMon, BoMon_2 = "";

    public GiangVien(String ID, String name, String BoMon) {
        this.ID = ID;
        this.name = name;
        this.BoMon = BoMon;
        String[] tmp = BoMon.split("\\s+");
        for(String item : tmp){
            this.BoMon_2 += item.substring(0,1).toUpperCase();
        }
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + BoMon_2;
    }

    public String getBoMon() {
        return BoMon;
    }

    
}
