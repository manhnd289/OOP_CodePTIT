package J03033;

import java.math.BigInteger;
import java.util.Scanner;

public class J03033 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        BigInteger a,b;
        
        while(t-- > 0){
            a = sc.nextBigInteger();
            b = sc.nextBigInteger();
            System.out.println(a. multiply(b).divide(a.gcd(b)));
        }
        
    }
    
}
