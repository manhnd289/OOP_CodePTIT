package J07033;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07033 {

    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = sc.nextInt(); sc.nextLine();
        SinhVien sv;
        ArrayList<SinhVien> arr = new ArrayList<>();
        
        while(t-- > 0){
            sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(sv);
        }
        Collections.sort(arr);
        for(SinhVien item : arr){
            System.out.println(item);
        }
        
    }
    
}
