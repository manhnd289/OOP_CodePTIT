package J07081;

import java.util.Arrays;

public class SinhVien implements Comparable<SinhVien>{

    private String ID, name, phone, email, firstName, lastName, midName;

    public SinhVien(String ID, String name, String phone, String email) {
        this.ID = ID;
        this.name = name;
        String[] inp = name.split("\\s+");
        this.firstName = inp[inp.length-1];
        this.lastName = inp[0];
        this.midName = String.join(" ", Arrays.copyOfRange(inp, 1, inp.length-1));
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + phone + " " + email;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(firstName.equals(o.firstName)){
            if(lastName.equals(o.lastName)){
                if(midName.equals(o.midName)){
                    return ID.compareTo(o.ID);
                }
                return midName.compareTo(o.midName);
            }
            return lastName.compareTo(o.lastName);
        }
        return firstName.compareTo(o.firstName);
    }
    
    
    
}
