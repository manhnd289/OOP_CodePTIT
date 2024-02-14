package J05044;

import java.util.ArrayList;
import java.util.Scanner;

public class J05044 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> arr = new ArrayList<>();
        
        for(int i = 1 ; i <= n ; i++){
            arr.add(new NhanVien(String.format("NV%02d",i), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        
        String inp = sc.nextLine();
        for(NhanVien item : arr){
            if(item.getPosition().equals(inp)) System.out.println(item);
        }
    }
    
}
