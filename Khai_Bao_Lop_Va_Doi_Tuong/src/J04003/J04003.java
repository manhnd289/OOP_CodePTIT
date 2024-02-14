package J04003;

import java.util.Scanner;

public class J04003 {
    
    public static long gcd(long a, long b){
        while(a*b!=0){
            if(a > b) a%=b;
            else b%=a;
        }
        return a+b;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        long tmp = gcd(a, b);
        System.out.println(new PhanSo(a/tmp, b/tmp));
        
    }
    
}
