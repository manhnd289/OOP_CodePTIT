package J01006;

import java.util.Scanner;

public class J01006 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        long[] a = new long[100];
        a[0] = a[1] = 1;
        for(int i = 2 ; i <= 92 ; i++) a[i] = a[i-1] + a[i-2];
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(a[n-1]);
        }
        
    }
    
}
