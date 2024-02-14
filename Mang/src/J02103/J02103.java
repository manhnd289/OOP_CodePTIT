package J02103;

import java.util.Scanner;

public class J02103 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m,n;
        
        for(int i1 = 1 ; i1 <= t ; i1++){
            n = sc.nextInt(); m = sc.nextInt();
            int[][] inp = new int[n][m];
            int[][] res = new int[n][n];
            
            System.out.println("Test " + i1 + ":");
            
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < m ; j++){
                    inp[i][j] = sc.nextInt();
                }
            }
            
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < n ; j++){
                    for(int k = 0 ; k < m ; k++){
                        res[i][j] += inp[i][k] * inp[j][k];
                    }
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        
    }
    
}
