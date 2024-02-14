package J01007;

import java.util.Arrays;
import java.util.Scanner;

public class J01007 {
    
    public static long[] F = new long[93];
    
    public static void fibo(){
        
        F[1] = F[2] = 1;
        for(int i = 3 ; i <= 92 ; i++){
            F[i] = F[i-1] + F[i-2];
        }
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        fibo();
        
        while(t-- > 0){
            long n = sc.nextLong();
            if(Arrays.binarySearch(F, n) >= 0) System.out.println("YES");
            else System.out.println("NO");
        }
        
    }
    
}
