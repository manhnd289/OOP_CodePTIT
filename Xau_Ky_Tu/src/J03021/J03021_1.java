package J03021;

import java.util.Scanner;

public class J03021_1 {
    
    public static char charVal(char c){
        String tmp = c + "";
        if(tmp.matches("[a-c]")) return '2';
        else if(tmp.matches("[d-f]")) return '3';
        else if(tmp.matches("[g-i]")) return '4';
        else if(tmp.matches("[j-l]")) return '5';
        else if(tmp.matches("[m-o]")) return '6';
        else if(tmp.matches("[p-s]")) return '7';
        else if(tmp.matches("[t-v]")) return '8';
        else return '9';
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        String res = "";
        String inp = "";
        
        while(t-- > 0){
            res = "";
            inp = sc.nextLine().toLowerCase();
            for(int i = 0 ; i < inp.length() ; i++){
                res += charVal(inp.charAt(i));
            }
            System.out.println(res.equals(new StringBuilder(res).reverse().toString()) ? "YES" : "NO");
        }
        
    }
    
}
