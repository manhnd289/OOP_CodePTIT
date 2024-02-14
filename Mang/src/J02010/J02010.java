package J02010;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02010 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < n ; i++) arr.add(sc.nextInt());
        
        for(int i = 0 ; i < n-1 ; i++){
            System.out.printf("Buoc %d: ",i+1);
            for(int j = i+1 ; j<n ; j++){
                if(arr.get(i) > arr.get(j)) Collections.swap(arr, i, j);
            }
            for(int item : arr) System.out.print(item + " ");
            System.out.println();
        }
        
        
    }

}
