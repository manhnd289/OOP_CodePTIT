package J02104;

import java.util.Scanner;

public class J02104 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = sc.nextInt();
                if(i < j && arr[i][j] == 1) System.out.printf("(%d,%d)\n", i+1,j+1);
            }
        }
        
    }
    
}
