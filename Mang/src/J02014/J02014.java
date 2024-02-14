package J02014;

import java.util.Scanner;

public class J02014 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            int[] num = new int[n];
            int[] _sum = new int[n];
            for(int i = 0 ; i < n ; i++){
                num[i] = sc.nextInt();
                if(i==0) _sum[i] = num[i];
                else _sum[i] = _sum[i-1] + num[i];
            }
            boolean check = false;
            for(int i = 1 ; i < n ; i++){
                if(_sum[i] == _sum[n-1] - _sum[i-1]){
                    check = true;
                    System.out.println(i+1);
                    break;
                }
            }
            if(!check) System.out.println(-1);
        }
        
    }
}
