package J01005;

import java.util.Scanner;

public class J01005 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0) {
            int n = sc.nextInt(), h = sc.nextInt();
            
            for(int i = 1 ; i <= n-1 ; i++) 
                System.out.printf("%.6f ", h*1.0 * Math.sqrt(i * 1.0/n));
            System.out.println();
            
        }
        
    }
    
}
