package J01013;

import java.util.Scanner;

public class J01013 {
    
    public static int[] a = new int[2000001];
    
    public static void sieve(){
        
        a[1] = 1;
        for(int i = 2 ; i <= 1420 ; i++){
            if(a[i] == 0){
                for(int j = i*i ; j <= 2000000 ; j+=i){
                    if(a[j] == 0) a[j] = i;
                }
            }
        }
        for(int i = 2 ; i <= 2000000 ; i++){
            if(a[i] == 0) a[i] = i;
        }
    }
    
    public static long solve(int n){
        if(n == 1) return 1;
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
        sieve();
        long sum = 0;
        
        while(t-- > 0){
            int n = sc.nextInt();
            sum += solve(n);
        }
        
        System.out.println(sum);
        
    }
    
}
