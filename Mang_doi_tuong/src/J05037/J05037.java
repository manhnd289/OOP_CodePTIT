package J05037;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05037 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> arr = new ArrayList<>();
        
        for(int i = 1 ; i <= n ; i++){
            arr.add(new MatHang(String.format("MH%02d", i), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(arr);
        arr.forEach(System.out::println);
    }
    
}
