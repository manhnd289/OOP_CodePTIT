package J05007;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05007 {

    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> arr = new ArrayList<>();
        
        for(int i = 1 ; i <= n ; i++){
            arr.add(new NhanVien(String.format("%05d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        
        Collections.sort(arr);
        arr.forEach(System.out::println);
        
    }
    
}
