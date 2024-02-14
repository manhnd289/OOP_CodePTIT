package J03010;

import java.util.HashMap;
import java.util.Scanner;

public class J03010 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        String[] inp;
        String res;
        HashMap<String,Integer> hmap = new HashMap<>();
        
        while(t-- > 0){
            inp = sc.nextLine().toLowerCase().trim().split("\\s+");
            res = inp[inp.length-1];
            for(int i = 0 ; i < inp.length-1 ; i++){
                res += inp[i].charAt(0);
            }
            if(!hmap.containsKey(res)){
                hmap.put(res, 1);
                System.out.println(res+"@ptit.edu.vn");
            } else {
                hmap.put(res, hmap.get(res)+1);
                System.out.println(res + hmap.get(res) + "@ptit.edu.vn");
            }
        }
        
    }
    
}
