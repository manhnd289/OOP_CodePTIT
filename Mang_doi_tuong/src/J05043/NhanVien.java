package J05043;

public class NhanVien {

    private String Id, name, position;
    private int base_Sal, working_Day, month_Sal, allowance, advance_Payment, final_Sal, remaining;

    public NhanVien(String Id, String name, String position, int base_Sal, int working_Day) {
        this.Id = Id;
        this.name = name;
        this.position = position;
        this.base_Sal = base_Sal;
        this.working_Day = working_Day;
        
        this.month_Sal = this.base_Sal * this.working_Day;
        
        
        
        if(position.equals("GD")) this.allowance = 500;
        else if(position.equals("PGD")) this.allowance = 400;
        else if(position.equals("TP")) this.allowance = 300;
        else if(position.equals("KT")) this.allowance = 250;
        else this.allowance = 100;
        
        this.final_Sal  = this.month_Sal + this.allowance;
        
        this.advance_Payment = Math.min((int) Math.round(this.final_Sal * 2/3 / 1000.0) * 1000, 25000);
        this.remaining = this.final_Sal - this.advance_Payment;
    }

    @Override
    public String toString() {
        return Id + " " + name + " " + allowance + " " + month_Sal + " " + advance_Payment + " " + this.remaining;
    }
    
    
    
}
