package J02034;

import java.util.ArrayList;
import java.util.Scanner;

public class J02034 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0 ; i < n ; i++){
            arr.add(sc.nextInt());
            if(i == 0 && arr.get(0) != 1){
                for(int j = 1 ; j < arr.get(0) ; j++) System.out.println(j);
            }
            if(i != 0 && arr.get(i) != arr.get(i-1) + 1){
                for(int j = arr.get(i-1)+1 ; j < arr.get(i) ; j++) System.out.println(j);
            }
        }
        if(arr.get(0) == 1 && arr.get(n-1) == n) System.out.println("Excellent!");
        
    }
    
}
