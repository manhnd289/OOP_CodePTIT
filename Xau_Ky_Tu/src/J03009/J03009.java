package J03009;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class J03009 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        String[] inp1,inp2;
        TreeSet<String> tset1,tset2;
        
        while(t-- > 0){
            inp1 = sc.nextLine().trim().split("\\s+");
            inp2 = sc.nextLine().trim().split("\\s+");
            tset1 = new TreeSet<>(Arrays.asList(inp1));
            tset2 = new TreeSet<>(Arrays.asList(inp2));
            tset1.removeAll(tset2);
            for(String item : tset1) System.out.print(item + " ");
            System.out.println();
        }
        
    }
    
}
