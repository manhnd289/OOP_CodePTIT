package J07072;

import java.util.Arrays;

public class DanhSach implements Comparable<DanhSach>{
    
    private String chuanHoa(String inp){
        String[] tmp = inp.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for(String item : tmp){
            sb.append(item.substring(0,1).toUpperCase());
            sb.append(item.substring(1));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    private String name, firstName, midName, lastName;

    public DanhSach(String name) {
        this.name = chuanHoa(name);
        String[] inp = this.name.split("\\s+");
        this.firstName = inp[inp.length-1];
        this.lastName = inp[0];
        this.midName = String.join(" ", Arrays.copyOfRange(inp, 1, inp.length-1));
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(DanhSach o) {
        if(firstName.equals(o.firstName)){
            if(lastName.equals(o.lastName)){
                return midName.compareTo(o.midName);
            }
            return lastName.compareTo(o.lastName);
        }
        return firstName.compareTo(o.firstName);
    }
    
    
    
}
