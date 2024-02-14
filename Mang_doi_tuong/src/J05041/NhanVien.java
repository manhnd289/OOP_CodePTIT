package J05041;

public class NhanVien implements Comparable<NhanVien>{

    private String Id, name, position;
    private int base_Sal, working_Day, bonus, month_Sal, allowance, final_Sal;

    public NhanVien(String Id, String name, int base_Sal, int working_Day, String position) {
        this.Id = Id;
        this.name = name;
        this.base_Sal = base_Sal;
        this.working_Day = working_Day;
        this.position = position;
        
        this.month_Sal = this.base_Sal * this.working_Day;
        
        if(working_Day >= 25) this.bonus = (int)(this.month_Sal * 0.2);
        else if(working_Day >= 22) this.bonus = (int)(this.month_Sal * 0.1);
        else this.bonus = 0;
        
        if(position.equals("GD")) this.allowance = 250000;
        else if(position.equals("PGD")) this.allowance = 200000;
        else if(position.equals("TP")) this.allowance = 180000;
        else if(position.equals("NV")) this.allowance = 150000;
        
        this.final_Sal = this.month_Sal + this.bonus + this.allowance;
    }

    @Override
    public int compareTo(NhanVien o) {
        return o.final_Sal - final_Sal;
    }

    @Override
    public String toString() {
        return Id + " " + name + " " + month_Sal + " " + bonus + " " + allowance + " " + final_Sal;
    }
    
    
    
}
