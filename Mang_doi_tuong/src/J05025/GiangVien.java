package J05025;

public class GiangVien implements Comparable<GiangVien>{

    private String ID, name, lastName;
    private String BoMon = "";

    public GiangVien(String ID, String name, String BoMon) {
        this.ID = ID;
        this.name = name.trim();
        this.lastName = this.name.substring(name.lastIndexOf(" ")+1);
        String[] inp = BoMon.trim().split("\\s+");
        for(String item : inp){
            this.BoMon += item.charAt(0);
        }
        this.BoMon = this.BoMon.toUpperCase();
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + BoMon;
    }

    @Override
    public int compareTo(GiangVien o) {
        if(this.lastName.equals(o.lastName)){
            return ID.compareTo(o.ID);
        }
        return lastName.compareTo(o.lastName);
    }
    
}