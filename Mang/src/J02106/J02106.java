package J02106;

import java.util.Scanner;

public class J02106 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        int cnt = 0;
        int tmp = 0;
        for(int i = 0 ; i < n ; i++){
            tmp = 0;
            for(int j = 0 ; j < 3 ; j++){
                arr[i][j] = sc.nextInt();
                tmp += arr[i][j];
            }
            if(tmp >= 2) cnt++;
        }
        System.out.println(cnt);
        
    }
    
}
