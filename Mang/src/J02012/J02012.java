package J02012;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02012 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < n ; i++) arr.add(sc.nextInt());
        ArrayList<Integer> arr1 = new ArrayList<>();
        
        for(int i = 0 ; i < n ; i++){
            System.out.printf("Buoc %d: ",i);
            arr1.add(arr.get(i));
            Collections.sort(arr1);
            for(int item : arr1) System.out.print(item + " ");
            System.out.println();
        }
        
        
    }
    
}
