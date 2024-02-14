package J02021;

import java.util.Scanner;

public class J02021 {

    public static int n,k;
    public static int cnt;
    
    public static void Try(int[] a, int i){
        
        for(int j = a[i-1]+1 ; j <= n ; j++){
            a[i] = j;
            if (i==k){
                for(int m = 1 ; m <= k ; m++) System.out.print(a[m]);
                System.out.print(" ");
                cnt += 1;
            }else Try(a, i+1);
        }
        
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); 
        k = sc.nextInt();
        cnt = 0;
        
        int[] a = new int[k+1];
        Try(a, 1);
        
        System.out.printf("\nTong cong co %d to hop",cnt);
        
    }
    
}
