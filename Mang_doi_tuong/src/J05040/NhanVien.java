package J05040;

public class NhanVien {

    private String Id, name, position;
    private int day_Sal, working_Day, month_Sal, bonus, allowance, final_Sal;

    public NhanVien(String Id, String name, int day_Sal, int working_Day, String position) {
        this.Id = Id;
        this.name = name;
        this.day_Sal = day_Sal;
        this.working_Day = working_Day;
        this.position = position;
        this.month_Sal = this.working_Day * this.day_Sal;
        
        if(this.working_Day >= 25) this.bonus = (int)(this.month_Sal*0.2);
        else if(this.working_Day >= 22) this.bonus = (int)(this.month_Sal*0.1);
        else this.bonus = 0;
        
        if(this.position.equals("GD")) this.allowance = 250000;
        else if(this.position.equals("PGD")) this.allowance = 200000;
        else if(this.position.equals("TP")) this.allowance = 180000;
        else if(this.position.equals("NV")) this.allowance = 150000;
        else this.allowance = 0;
        
        this.final_Sal = this.month_Sal + this.bonus + this.allowance;
    }

    @Override
    public String toString() {
        return Id + " " + name + " " + month_Sal + " " + bonus + " " + allowance + " " + final_Sal;
    }
    
    
    
    
    
}
