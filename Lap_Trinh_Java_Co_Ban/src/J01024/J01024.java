package J01024;

import java.util.Scanner;

public class J01024 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        
        while(t-- > 0){
            String num = sc.nextLine();
            if(num.matches("[012]+")) System.out.println("YES");
            else System.out.println("NO");
        }
        
    }
    
}
