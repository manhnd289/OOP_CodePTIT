package J03016;

import java.math.BigInteger;
import java.util.Scanner;

public class J03016 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        BigInteger a = new BigInteger("11");
        BigInteger b = new BigInteger("0");
        
        while(t-- > 0){
            if(sc.nextBigInteger().mod(a).equals(b)) System.out.println(1);
            else System.out.println(0);
        }
        
    }
    
}
