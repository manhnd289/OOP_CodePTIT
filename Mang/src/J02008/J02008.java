package J02008;

import java.util.Scanner;

public class J02008 {
    
    public static long lcm(long a,long b){
        long tmp = a*b;
        while(a*b!=0){
            if(a >= b) a%=b;
            else b%=a;
        }
        return tmp / (a+b);
    }
    
    public static long solve(int n){
        long res = 1;
        for(int i = 2 ; i <= n ; i++){
            res = lcm(res, i);
        }
        return res;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        
        while(t-- > 0){
            n = sc.nextInt();
            System.out.println(solve(n));
        }
        
    }
    
}
