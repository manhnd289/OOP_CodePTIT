package J03039;

import java.math.BigInteger;
import java.util.Scanner;

public class J03039 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        BigInteger a,b;
        BigInteger tmp = new BigInteger("0");
        
        while(t-- > 0){
            a = sc.nextBigInteger();
            b = sc.nextBigInteger();
            if(a.mod(b).equals(tmp) || b.mod(a).equals(tmp)) System.out.println("YES");
            else System.out.println("NO");
        }
        
    }
    
}
