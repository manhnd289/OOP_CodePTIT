package J05022;

import java.util.ArrayList;
import java.util.Scanner;

public class J05022 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();
        
        while(t-- > 0){
            arr.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String lop = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + lop + ":");
            for(SinhVien item : arr){
                if(item.getLop().equals(lop)) System.out.println(item);
            }
        }
        
    }
    
}
