package J02012;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02012_1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < n ; i++) arr.add(sc.nextInt());

        for(int i = 0 ; i < n ; i++){
            int tmp = arr.get(i);
            int j = i-1;
            while(j >= 0 && arr.get(j) > tmp){
                Collections.swap(arr, j, j+1); j--;
            }
            arr.set(j+1, tmp);
            System.out.printf("Buoc %d: ",i);
            for(int k = 0; k <= i ; k++) System.out.print(arr.get(k) + " ");
            System.out.println();
        }
        
    }
        
}
