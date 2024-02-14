package J03007;

import java.util.Scanner;

public class J03007 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        String inp = "";
        boolean check = true;
        int sum = 0;
        
        while(t-- > 0){
            check = true;
            inp = sc.nextLine();
            sum = 0;
            if(inp.charAt(0) == '8' && inp.charAt(inp.length()-1) == '8'){
                for(int i = 0 ; i < inp.length() ; i++){
                    sum += Integer.parseInt(inp.substring(i,i+1));
                }
                if(sum % 10 != 0) check = false;
            }else check = false;
            
            System.out.println(check ? "YES" : "NO");
        }
        
    }
    
}
