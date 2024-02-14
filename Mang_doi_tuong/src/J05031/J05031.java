package J05031;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05031 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();
        
        for(int i = 0 ; i < n ; i++){
            arr.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(arr);
        for(int i = 0 ; i < n ; i++){
            System.out.print(i+1 + " ");
            System.out.println(arr.get(i));
        }
        
    }
    
}
