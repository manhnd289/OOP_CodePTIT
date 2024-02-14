package J01010;

import java.util.Scanner;

public class J01010 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String inp = sc.nextLine();
            if(inp.matches("[0189]+")){
                inp = inp.replace('8', '0').replace('9', '0');
                long tmp = Long.parseLong(inp);
                if(tmp == 0) System.out.println("INVALID");
                else System.out.println(tmp);
            } else {
                System.out.println("INVALID");
            }
        }
        
    }
    
}
