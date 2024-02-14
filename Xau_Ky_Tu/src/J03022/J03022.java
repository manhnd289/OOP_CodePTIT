package J03022;

import java.util.Scanner;

public class J03022 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String res = "";
        
        while(sc.hasNext()){
            String s = sc.next();
            res += s.replaceAll("[!\\.\\?]$", "\n") + " ";
        }
        
        String[] s = res.split("\n\\s?");
        for(String item : s){
            System.out.println(item.substring(0,1).toUpperCase() + item.substring(1).toLowerCase());
        }
        
    }
    
}
