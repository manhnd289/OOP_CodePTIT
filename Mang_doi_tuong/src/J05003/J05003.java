package J05003;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class J05003 {

    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        ArrayList<SinhVien> arr = new ArrayList<>();
        
        for(int i = 1 ; i <= n ; i++){
            SinhVien sv = new SinhVien();
            sv.setId("B20DCCN" + String.format("%03d", i));
            sv.setName(sc.nextLine());
            sv.setLop(sc.nextLine());
            sv.setDob(sc.nextLine());
            sv.setGpa(Double.valueOf(sc.nextLine()));
            arr.add(sv);
        }
        
        arr.forEach(System.out::println);
        
    }
    
}
