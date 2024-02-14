package J03015;

import java.math.BigInteger;
import java.util.Scanner;

public class J03015 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        if(a.subtract(b) == new BigInteger("0")) System.out.println("0");
        else System.out.println(a.subtract(b));
        
    }
    
}
