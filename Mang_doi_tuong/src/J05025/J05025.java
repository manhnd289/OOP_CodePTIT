
package J05025;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class J05025 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t =  Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> arr = new ArrayList<>();
        
        for(int i = 1 ; i <= t ; i++){
            arr.add(new GiangVien(String.format("GV%02d",i),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(arr);
        arr.forEach(System.out::println);
        
    }
    
}
