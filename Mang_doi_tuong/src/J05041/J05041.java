package J05041;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05041 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> arr = new ArrayList<>();
        
        for(int i = 1 ; i <= n ; i++){
            arr.add(new NhanVien(String.format("NV%02d", i), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine()));
        }
        Collections.sort(arr);
        arr.forEach(System.out::println);
        
    }
    
}
