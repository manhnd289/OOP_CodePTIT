package J07048;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07048 {

    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = sc.nextInt(); sc.nextLine();
        SanPham sp;
        ArrayList<SanPham> arr = new ArrayList<>();
        
        while(t-- > 0){
            sp = new SanPham(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(sp);
        }
        Collections.sort(arr);
        for(SanPham item : arr){
            System.out.println(item);
        }
    }
    
}
