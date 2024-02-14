package J05028;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05028 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        ArrayList<DoanhNghiep> arr = new ArrayList<>();
        
        while(n-- > 0){
            arr.add(new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.valueOf(sc.nextLine())));
        }
        Collections.sort(arr);
        arr.forEach(System.out::println);
        
    }
    
}
