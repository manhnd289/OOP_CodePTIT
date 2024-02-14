package J01022;

import java.util.Scanner;

public class J01022 {
    
    public static long[] fibo = new long[93];
    
    public static void init(){
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i = 2 ; i <= 92; i++){
            fibo[i] = fibo[i-2] + fibo[i-1];
        }
    }
    
    public static int solve(long n, long k){
        if(n == 1) return 0;
        if(n == 2) return 1;
        if(k <= fibo[(int)n-2]) return solve(n-2, k);
        return solve(n-1, k-fibo[(int)n-2]);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long n,k;
        init();
        
        while(t-- > 0){
            n = sc.nextLong(); k = sc.nextLong();
            System.out.println(solve(n, k));
            
        }
        
    }
    
}
