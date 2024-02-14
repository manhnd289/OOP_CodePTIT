package J03004;

import java.util.Scanner;

public class J03004 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        
        while(t-- > 0){
            String[] inp = sc.nextLine().trim().split("\\s+");
            for(int i = 0 ; i < inp.length ; i++){
                inp[i] = inp[i].substring(0, 1).toUpperCase() + inp[i].substring(1).toLowerCase();
            }
            for(String item : inp){
                System.out.print(item + " ");
            }
            System.out.println();
        }
        
    }
    
}
