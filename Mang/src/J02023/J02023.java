package J02023;

import java.util.Arrays;
import java.util.Scanner;

public class J02023 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        
        if(s > n*9 || s < 1) System.out.println("-1 -1");
        else{
            int s0 = s;
            char[] minNum = new char[n];
            Arrays.fill(minNum, '0');
            char[] maxNum = new char[n];
            Arrays.fill(maxNum, '0');
            
            for(int i = 0 ; i < n ; i++){
                maxNum[i] += Math.min(9, s);
                s -= Math.min(9, s);
                if(s == 0) break;
            }
            
            minNum[0] = '1'; s0--;
            for(int i = n-1 ; i >= 0 ; i--){
                minNum[i] += Math.min(9,s0);
                s0 -= Math.min(9, s0);
                if(s0 == 0) break;
            }
            System.out.println(new String(minNum) + " " + new String(maxNum));
        }
        sc.close();
    }
    
}
