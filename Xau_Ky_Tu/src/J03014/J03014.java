package J03014;

import java.util.Scanner;

public class J03014 {

    public static void main(String[] args) throws NumberFormatException{
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println(sc.nextBigInteger().add(sc.nextBigInteger()));
        
        sc.close();
        
    }
    
}
