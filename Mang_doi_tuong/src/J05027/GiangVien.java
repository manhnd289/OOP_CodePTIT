package J05027;

public class GiangVien {

    private String Id, name, boMon, acronym = "";

    public GiangVien(String Id, String name, String boMon) {
        this.Id = Id;
        this.name = name;
        this.boMon = boMon;
        for(int i = 0 ; i < boMon.length() ; i++){
            if(i == 0 || boMon.charAt(i-1) == ' ') this.acronym += Character.toUpperCase(boMon.charAt(i)) + "";
        }
    }

    public String getName() {
        return name.toLowerCase();
    }

    @Override
    public String toString() {
        return Id + " " + name + " " + acronym;
    }
    
    
    
}
