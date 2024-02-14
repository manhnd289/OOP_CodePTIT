package J05027;

import java.util.ArrayList;
import java.util.Scanner;

public class J05027 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        ArrayList<GiangVien> arr = new ArrayList<>();
        
        for(int i = 1 ; i <= n ; i++){
            arr.add(new GiangVien(String.format("GV%02d", i), sc.nextLine(), sc.nextLine()));
        }
        
        int q = Integer.valueOf(sc.nextLine());
        
        while(q-- > 0){
            String tmp = sc.nextLine();
            String tmp1 = tmp.toLowerCase();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + tmp + ":");
            for(GiangVien item : arr){
                if(item.getName().contains(tmp1)) System.out.println(item);
            }
        }
        
    }
    
}
