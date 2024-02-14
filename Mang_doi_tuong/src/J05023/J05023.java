package J05023;

import java.util.ArrayList;
import java.util.Scanner;

public class J05023 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();
        
        while(t-- > 0){
            arr.add(new SinhVien(sc.nextLine(),sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String inp = sc.nextLine();
            String tmp = inp.substring(2,4);
            System.out.println("DANH SACH SINH VIEN KHOA " + inp + ":");
            for(SinhVien item : arr){
                if(item.getLop().substring(1,3).equals(tmp)){
                    System.out.println(item);
                }
            }
        }
        
    }
    
}
