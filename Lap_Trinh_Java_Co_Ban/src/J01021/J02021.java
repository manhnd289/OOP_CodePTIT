package J01021;

import java.util.Scanner;

public class J02021 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        long a,b,res;
        int mod = (int)1e9 + 7;
        
        while(true){
            a = sc.nextLong();
            b = sc.nextLong();
            if(a==0 && b==0) break;
            res = 1;
            while(b != 0){
                if(b % 2 == 1) res = res % mod * a % mod;
                b/=2;
                a = a%mod * a%mod;
            }
            System.out.println(res);
        }
        
    }
    
}
