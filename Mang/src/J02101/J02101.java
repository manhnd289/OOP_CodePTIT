package J02101;

import java.util.Scanner;

public class J02101 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] arr = new int[105][105];
        
        while(t-- > 0){
            int n = sc.nextInt();
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < n ; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < n ; j++){
                    if(i%2==0) System.out.print(arr[i][j] + " ");
                    else System.out.print(arr[i][n-1-j] + " ");
                }
            }
            System.out.println();
            
        }
        
    }
    
}
