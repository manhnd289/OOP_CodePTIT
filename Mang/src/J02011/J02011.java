package J02011;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02011 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < n ; i++) arr.add(sc.nextInt());
        int idx_min = 0;
        
        for (int i = 0 ; i < n-1 ; i++){
            idx_min = i;
            for(int j = i+1 ; j < n ; j++){
                if(arr.get(j) < arr.get(idx_min)) idx_min = j;
            }
            Collections.swap(arr, i, idx_min);
            System.out.printf("Buoc %d: ",i+1);
            for(int item : arr) System.out.print(item + " ");
            System.out.println();
        }
        
        sc.close();
        
    }
    
}
