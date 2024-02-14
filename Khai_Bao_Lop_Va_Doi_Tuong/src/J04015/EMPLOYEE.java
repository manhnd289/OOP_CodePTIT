package J04015;

public class EMPLOYEE {

    private String id, name, role;
    private long bac,phucap,thunhap,salary;
    

    public EMPLOYEE(String id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.role = id.substring(0,2);
        this.bac = Integer.parseInt(id.substring(2));
        if(this.role.equals("HT")) this.phucap = 2000000;
        else if(this.role.equals("HP")) this.phucap = 900000;
        else if(this.role.equals("GV")) this.phucap = 500000;
        this.thunhap = this.salary * this.bac + this.phucap;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + bac + " " + phucap + " " + thunhap;
    }
    
    
    
}
