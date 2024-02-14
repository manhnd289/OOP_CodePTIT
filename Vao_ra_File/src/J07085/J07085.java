package J07085;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.util.ArrayList;

public class J07085 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        FileInputStream fis = new FileInputStream("DATA.in");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        ArrayList<String> arr = (ArrayList<String>) ois.readObject();
        int res = 0;
        fis.close();
        ois.close();
        
        for(String item_str : arr){
            StringBuilder sb = new StringBuilder("");
            res = 0;
            for(int i = 0 ; i < item_str.length() ; i++){
                if(Character.isDigit(item_str.charAt(i))) sb.append(item_str.charAt(i));
            }
            String num = sb.toString();
            for(int i = 0 ; i < num.length() ; i++){
                res += num.charAt(i) - '0';
            }
            System.out.println(new BigInteger(num) + " " + res);
            
        }
        
    }
    
}
