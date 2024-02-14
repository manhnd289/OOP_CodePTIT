package J03032;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J03032 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        StringBuilder sb;
        
        while(t-- > 0){
            String[] inp = sc.nextLine().trim().split("\\s+");
            ArrayList<StringBuilder> arr = new ArrayList<>();
            for(String item : inp){
                sb = new StringBuilder(item);
                arr.add(sb);
            }
            for(StringBuilder item : arr){
                System.out.print(item.reverse() + " ");
            }
            System.out.println();
        }
        
    }
    
}
