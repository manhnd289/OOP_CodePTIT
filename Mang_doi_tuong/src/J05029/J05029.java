package J05029;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05029 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> arr = new ArrayList<>();
        
        while(n-- > 0){
            arr.add(new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.valueOf(sc.nextLine())));
        }
        Collections.sort(arr);
        
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String[] inp = sc.nextLine().split("\\s+");
            Integer a = Integer.valueOf(inp[0]);
            Integer b = Integer.valueOf(inp[1]);
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            for(DoanhNghiep item : arr){
                if(item.getAmount() >= a && item.getAmount() <= b) System.out.println(item);
            }
        }
        
    }
    
}
