package J03027;

import java.util.Scanner;

public class J03027 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        StringBuilder sb = new StringBuilder(inp);
        boolean check = true;
        while(check){
            check = false;
            for(int i = 0 ; i < sb.length()-1 ; i++){
                if(sb.charAt(i) == sb.charAt(i+1)){
                    sb.delete(i, i+2);
                    check = true;
                }
            }
        }
        if(sb.toString().equals("")) System.out.println("Empty String");
        else System.out.println(sb.toString());
    }
    
}
