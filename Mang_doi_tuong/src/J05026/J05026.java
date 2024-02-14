package J05026;

import java.util.ArrayList;
import java.util.Scanner;

public class J05026 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        ArrayList<GiangVien> arr = new ArrayList<>();
        
        for(int i = 1 ; i<= n ; i++){
            arr.add(new GiangVien(String.format("GV%02d", i), sc.nextLine(), sc.nextLine()));
        }
        
        int q = Integer.valueOf(sc.nextLine());
        while(q-- > 0){
            String tmp = sc.nextLine();
            StringBuilder acronym = new StringBuilder("");
            for(int i = 0 ; i < tmp.length() ; i++){
                if(i == 0 || tmp.charAt(i-1) == ' '){
                    acronym.append(Character.toUpperCase(tmp.charAt(i)));
                }
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + acronym + ":");
            for(GiangVien item : arr){
                if(item.getBoMon().equals(tmp)) System.out.println(item);
            }
        }
        
    }
    
}
