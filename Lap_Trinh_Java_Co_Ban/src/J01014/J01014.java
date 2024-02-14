package J01014;

import java.util.Scanner;

public class J01014 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long res;
        
        
        while(t-- > 0){
            res = Long.MIN_VALUE;
            long num = sc.nextLong();
            for(int i = 2 ; i <= Math.sqrt(num) ; i++){
                while(num % i == 0){
                    res = Math.max(res, i);
                    num/=i;
                }
            }
            if(num != 1) res = Math.max(res,num);
            System.out.println(res);
        }
        
    }
    
}
