package J04006;

import java.text.ParseException;
import java.util.Scanner;

public class J04006 {

    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        SinhVien a = new SinhVien("B20DCCN001", sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
        System.out.println(a);
    }
    
}
