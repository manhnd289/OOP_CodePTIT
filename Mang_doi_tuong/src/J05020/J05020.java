package J05020;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class J05020 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();
        
        while(t-- > 0){
            arr.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        arr.forEach(System.out::println);
        
    }
    
}
