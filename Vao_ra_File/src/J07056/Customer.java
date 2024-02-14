package J07056;

public class Customer implements Comparable<Customer>{

    private String id, name;
    private Integer num_elec, norm, under_norm, beyond_norm, VAT_tax, total_fee;
    
    private static String chuanHoa(String inp){
        
        String[] tmp = inp.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for(String item : tmp){
            sb.append(item.substring(0,1).toUpperCase());
            sb.append(item.substring(1));
            sb.append(" ");
        }
        return sb.toString().trim();
        
    }

    public Customer(String id, String name, String data) {
        this.id = id;
        this.name = chuanHoa(name);
        
        String[] tmp = data.trim().split("\\s+");
        
        if(tmp[0].equals("A")) this.norm = 100;
        else if(tmp[0].equals("B")) this.norm = 500;
        else if(tmp[0].equals("C")) this.norm = 200;
        
        this.num_elec = Integer.parseInt(tmp[2]) - Integer.parseInt(tmp[1]);
        
        if(this.num_elec < this.norm){
            this.under_norm = 450 * this.num_elec;
            this.beyond_norm = 0;
        } else {
            this.under_norm = this.norm * 450;
            this.beyond_norm = (this.num_elec - this.norm) * 1000;
        }
        
        this.VAT_tax = (int)(0.05 * this.beyond_norm);
        this.total_fee = this.under_norm  + this.beyond_norm + this.VAT_tax;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + under_norm + " " + beyond_norm + " " + VAT_tax + " " + total_fee;
    }

    @Override
    public int compareTo(Customer o) {
        return o.total_fee.compareTo(total_fee);
    }
    
}
