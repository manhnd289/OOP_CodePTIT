package J04007;

import java.text.ParseException;
import java.util.Scanner;

public class J04007 {

    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        Employee a = new Employee("00001", sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        System.out.println(a);
    }
    
}
