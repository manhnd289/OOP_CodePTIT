package J07003;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003 {

    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("DATA.in"));
        String num = sc.nextLine();
        BigInteger a,b;
        while(num.length() != 1){
            a = new BigInteger(num.substring(0,num.length()/2));
            b = new BigInteger(num.substring(num.length()/2));
            num = a.add(b).toString();
            System.out.println(num);
        }
        
    }
    
}
