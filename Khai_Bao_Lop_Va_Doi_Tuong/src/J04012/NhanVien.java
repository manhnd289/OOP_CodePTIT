
package J04012;

import java.util.HashMap;

public class NhanVien {

    private String ID = "NV01", name, position;
    private Integer baseSalary, finalSalary, finalSalary1, bonus, dayOnSite;
    
    private static HashMap<String, Integer> hmap = new HashMap<>();
    
    public static void Init(){
            hmap.put("GD", 250000);
            hmap.put("PGD", 200000);
            hmap.put("TP", 180000);
            hmap.put("NV", 150000);
    }

    public NhanVien(String name, Integer baseSalary, Integer dayOnSite, String position) {
        this.name = name;
        this.position = position;
        this.baseSalary = baseSalary;
        this.dayOnSite = dayOnSite;
        
        this.finalSalary = this.baseSalary * this.dayOnSite;
        this.finalSalary1 = this.finalSalary;
        
        if(dayOnSite >= 25) this.bonus = (int)(this.finalSalary * 0.2);
        else if(dayOnSite >= 22) this.bonus = (int)(this.finalSalary * 0.1);
        else this.bonus = 0;
        this.finalSalary1 += this.bonus;
        
        this.finalSalary1 += hmap.get(this.position);
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + this.finalSalary + " " + this.bonus + " " + hmap.get(this.position) + " " + finalSalary1;
    }
    
}
