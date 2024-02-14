package J03005;

import java.util.Scanner;

public class J03005 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        
        while(t-- > 0){
            String[] inp = sc.nextLine().trim().split("\\s+");
            inp[0] = inp[0].toUpperCase();
            for(int i = 1 ; i < inp.length ; i++){
                inp[i] = inp[i].substring(0,1).toUpperCase() + inp[i].substring(1).toLowerCase();
            }
            for(int i = 1 ; i < inp.length ; i++){
                System.out.print(inp[i]);
                if(i == inp.length-1) System.out.print(", ");
                else System.out.print(" ");
            }
            System.out.printf("%s\n",inp[0]);
        }
        
    }
    
}
