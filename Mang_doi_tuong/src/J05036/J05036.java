package J05036;

import java.util.ArrayList;
import java.util.Scanner;

public class J05036 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> arr = new ArrayList<>();
        
        for(int i = 1 ; i <= n ; i++){
            arr.add(new MatHang(String.format("MH%02d", i), sc.nextLine(), sc.nextLine(),Integer.valueOf(sc.nextLine()), Integer.valueOf(sc.nextLine())));
        }
        arr.forEach(System.out::println);
        
    }
    
}
