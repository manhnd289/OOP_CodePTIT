package J03012;

import java.util.Scanner;

public class J03012 {

    public static void main(String[] args) throws NumberFormatException{
        
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        
        while(t-- > 0) {
            System.out.println(sc.nextBigInteger().add(sc.nextBigInteger()));
        }
        
        sc.close();
        
    }
    
}
