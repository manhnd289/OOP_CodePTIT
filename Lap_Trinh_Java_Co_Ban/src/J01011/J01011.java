package J01011;

import java.util.Scanner;

public class J01011 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int a = sc.nextInt(), b = sc.nextInt();
            long lcm = 1l*a*b;
            while(a!=b){
                if(a>b) a-=b;
                else b-=a;
            }
            System.out.println(lcm/a + " " + a);
        }
        
    }
    
}
