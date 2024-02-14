package J02013;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02013 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), step = 0;
        boolean isSorted = false;
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < n ; i++) arr.add(sc.nextInt());
        
        for(int i = 0 ; i < n ; i++){
            isSorted = false;
            for(int j = 0 ; j < n-1-i ; j++){
                if(arr.get(j) > arr.get(j+1)){
                    Collections.swap(arr, j, j+1);
                    isSorted = true;
                }
            }
            if(isSorted){
                System.out.printf("Buoc %d: ",++step);
                for(int item : arr) System.out.print(item + " ");
                System.out.println();
            }
        }
        sc.close();
        
    }
    
}
