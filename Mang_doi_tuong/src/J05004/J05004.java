package J05004;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class J05004 {

    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr= new ArrayList<>();
        
        for(int i = 1 ; i <= n ; i++){
            arr.add(new SinhVien(String.format("B20DCCN%03d", i), sc.nextLine().toLowerCase(), sc.nextLine(), sc.nextLine(), Double.valueOf(sc.nextLine())));
        }
        arr.forEach(System.out::println);
    }
    
}
