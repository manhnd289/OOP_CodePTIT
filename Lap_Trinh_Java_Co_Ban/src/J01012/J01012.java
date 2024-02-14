package J01012;

import java.util.Scanner;

public class J01012 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cnt = 0;
        
        while(t-- > 0){
            
            cnt = 0;
            int n = sc.nextInt();
            for(int i = 1 ; i <= Math.sqrt(n) ; i++){
                if(n % i == 0){
                    if(i%2==0) cnt++;
                    if((n/i) != i && (n/i) % 2 == 0) cnt++;
                }
            }
            System.out.println(cnt);
            
        }
        
    }
    
}
