package J03031;

import java.util.HashSet;
import java.util.Scanner;

public class J03031 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        HashSet<Character> hset = new HashSet<>();
        boolean check = true;
        
        while(t-- > 0){
            check = true;
            hset.clear();
            char[] inp = sc.nextLine().toLowerCase().toCharArray();
            if(inp.length < 26) check = false;
            else{
                int num = Integer.parseInt(sc.nextLine());
                for(int i = 0 ; i < inp.length ; i++) hset.add(inp[i]);
                if(num < 26-hset.size()) check = false;
            }
            System.out.println(check ? "YES" : "NO");
        }
        
    }
    
}
