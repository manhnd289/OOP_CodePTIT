package J05038;

public class NhanVien {

    private String Id, name, position;
    private int daySal, working_Day, month_Sal, bonus, allowance, final_sal;
    public static int sum = 0;

    public NhanVien(String Id, String name, Integer daySal, Integer working_Day,String position) {
        this.Id = Id;
        this.name = name;
        this.position = position;
        this.daySal = daySal;
        this.working_Day = working_Day;
        
        this.month_Sal = daySal * working_Day;
        
        if(this.working_Day >= 25) this.bonus = (int)(this.month_Sal*0.2);
        else if(this.working_Day >= 22) this.bonus = (int)(this.month_Sal*0.1);
        else this.bonus = 0;
        
        if(this.position.equals("GD")) this.allowance = 250000;
        else if(this.position.equals("PGD")) this.allowance = 200000;
        else if(this.position.equals("TP")) this.allowance = 180000;
        else if(this.position.equals("NV")) this.allowance = 150000;
        else this.allowance = 0;
        
        this.final_sal = this.month_Sal + this.bonus + this.allowance;
        
        sum += this.final_sal;
    }

    @Override
    public String toString() {
        return Id + " " + name + " " + month_Sal + " " + bonus + " " + allowance + " " + final_sal;
    }
    
    
    
}
