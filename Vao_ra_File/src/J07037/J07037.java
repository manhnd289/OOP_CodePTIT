package J07037;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07037 {

    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("DN.in"));
        int t = sc.nextInt(); sc.nextLine();
        DoanhNghiep dn;
        ArrayList<DoanhNghiep> arr = new ArrayList<>();
        
        while(t-- > 0){
            dn = new DoanhNghiep(sc.nextLine(),sc.nextLine(),sc.nextLine());
            arr.add(dn);
        }
        Collections.sort(arr);
        for(DoanhNghiep item : arr) System.out.println(item);
    }
    
}
