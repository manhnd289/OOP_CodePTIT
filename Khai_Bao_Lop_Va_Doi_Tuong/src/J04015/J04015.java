package J04015;

import java.util.Scanner;

public class J04015 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        EMPLOYEE emp = new EMPLOYEE(sc.nextLine(), sc.nextLine(), sc.nextLong());
        System.out.println(emp);
        
    }
    
}
