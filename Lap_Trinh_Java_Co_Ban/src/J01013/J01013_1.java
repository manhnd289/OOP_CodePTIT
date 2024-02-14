package J01013;

import java.util.Scanner;

public class J01013_1 {
    
    public static int[] a = new int[2000001];
    
    public static void sieve(){
        
        for(int i = 2 ; i  <= 2000000 ; i++) a[i] = i;
        a[1] = 1;
        for(int i = 2 ; i <= 1420 ; i++){
            if(a[i] == i){
                for(int j = i*i ; j <= 2000000 ; j+=i){
                    if(a[j] == j) a[j] = i;
                }
            }
        }
    }
    
    public static long solve(int n){
        
        if(n==1) return 1;
        long sum = 0;
        while(n != 1){
            sum += a[n];
            n /= a[n];
        }
        return sum;
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long res = 0;
        sieve();
        
        while(t-- > 0){
            int n = sc.nextInt();
            res += solve(n);
        }
        System.out.println(res);
        
    }
    
}
