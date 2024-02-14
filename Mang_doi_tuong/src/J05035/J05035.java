package J05035;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05035 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();
        
        for(int i = 1 ; i <= n ; i++){
            arr.add(new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String tmp = sc.nextLine();
            for(SinhVien item : arr){
                if(item.getIncName().equals(tmp)) System.out.println(item);
            }
        }
        
    }
    
}
