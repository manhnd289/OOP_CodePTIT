package J01026;

import java.util.Scanner;

public class J01026 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            if((int)Math.sqrt(n) * (int)Math.sqrt(n) == n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
