package J05006;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class J05006 {

    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> arr = new ArrayList<>();
        
        for(int i = 1 ; i <= n ; i++){
            arr.add(new NhanVien(String.format("%05d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        arr.forEach(System.out::println);
        
    }
    
}
