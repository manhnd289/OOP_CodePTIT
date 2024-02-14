package J02004;

import java.util.Scanner;

public class J02004 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n; boolean check;
        
        while(t-- > 0){
            n = sc.nextInt(); sc.nextLine();
            String[] tmp = sc.nextLine().trim().split("\\s+");
            check =  true;
            for(int i = 0 ; i < tmp.length/2 ; i++){
                if(!tmp[i].equals(tmp[tmp.length-1-i])){
                    check = false;
                    break;
                }
            }
            System.out.println(check ? "YES" : "NO");
            
        }
        
    }

}
