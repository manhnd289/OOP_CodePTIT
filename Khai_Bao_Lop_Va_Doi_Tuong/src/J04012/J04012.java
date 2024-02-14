package J04012;

import java.util.Scanner;

public class J04012 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        NhanVien.Init();
        System.out.println(new NhanVien(sc.nextLine(), Integer.valueOf(sc.nextLine()), Integer.valueOf(sc.nextLine()), sc.nextLine()));
        
    }
    
}
