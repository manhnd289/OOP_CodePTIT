package J02007;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class J02007 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 1;
        
        while(t-- > 0){
            int n = sc.nextInt(); sc.nextLine();
            String[] arr = sc.nextLine().trim().split("\\s+");
            LinkedHashMap<String, Integer> lhmap = new LinkedHashMap<>();
            for(String item : arr){
                if(lhmap.containsKey(item)) lhmap.replace(item, lhmap.get(item)+1);
                else lhmap.put(item, 1);
            }
            System.out.println("Test " + (i) + ":");
            for(String key : lhmap.keySet()){
                System.out.println(key + " xuat hien " + lhmap.get(key) + " lan");
            }
            i++;
        }
        
    }

}
