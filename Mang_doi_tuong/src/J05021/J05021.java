package J05021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05021 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> arr = new ArrayList<>();
        
        while(sc.hasNextLine()){
            arr.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        
        Collections.sort(arr);
        arr.forEach(System.out::println);
        
    }
    
}
