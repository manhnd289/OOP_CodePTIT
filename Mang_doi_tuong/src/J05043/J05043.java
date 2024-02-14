package J05043;

import java.util.ArrayList;
import java.util.Scanner;

public class J05043 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> arr = new ArrayList<>();
        
        for(int i = 1 ; i <= n ; i++){
            arr.add(new NhanVien(String.format("NV%02d", i), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        arr.forEach(System.out::println);
    }
    
}
