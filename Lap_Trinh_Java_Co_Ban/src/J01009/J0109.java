package J01009;

import java.util.Scanner;

public class J0109 {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long res = 0;
        long tmp = 1;
        
        for(int i = 1 ; i <= n ; i++){
            tmp *= i;
            res += tmp;
        }
        System.out.println(res);
        
    }
    
}

