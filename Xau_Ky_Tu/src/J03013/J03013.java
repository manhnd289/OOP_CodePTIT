package J03013;

import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            int length = Math.max(a.toString().length(), b.toString().length());
            System.out.println(String.format("%" + length + "s", a.subtract(b).abs().toString()).replace(' ', '0'));
        }
        
    }
    
}
