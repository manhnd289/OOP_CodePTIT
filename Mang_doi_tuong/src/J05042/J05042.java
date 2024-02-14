package J05042;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class J05042 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();
        
        for(int i = 0 ; i < n ; i++){
            String name = sc.nextLine();
            String inp[] = sc.nextLine().trim().split("\\s+");
            int ac_ex = Integer.valueOf(inp[0]);
            int sub_ex = Integer.valueOf(inp[1]);
            
            SinhVien sv = new SinhVien(name, ac_ex, sub_ex);
            arr.add(sv);
        }
        Collections.sort(arr);
        arr.forEach(System.out::println);
        
    }
    
}
