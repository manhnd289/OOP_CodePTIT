package J02022;

import java.util.Scanner;

public class J02022 {
    
    public static int[] check = new int[15];
    public static int[] res = new int[15];
    public static int n;
    
    public static boolean isValid(){
        for(int i = 1 ; i < n ; i++){
            if(Math.abs(res[i] - res[i-1]) == 1) return false;
        }
        return true;
    }
    
    public static void Try(int i){
        for(int j = 1 ; j <= n ; j++){
            if(check[j] == 0){
                check[j] = 1;
                res[i] = j;
                if(i == n-1){
                    if(isValid()){
                        for(int k = 0 ; k < n ; k++){
                            System.out.print(res[k]);
                        }
                        System.out.println("");
                    }
                }else Try(i+1);
                check[j] = 0;
            }
        }
        
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            n = sc.nextInt();
            Try(0);
        }
        
    }
    
}
