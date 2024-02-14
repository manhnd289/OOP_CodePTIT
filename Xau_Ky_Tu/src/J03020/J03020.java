package J03020;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class J03020 {
    
    private static boolean isReversable(String inp){
        int l = 0, r = inp.length()-1;
        while(l < r){
            if(inp.charAt(l) != inp.charAt(r)) return false;
            l++; r--;
        }
        return true;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String,Integer> lhmap = new LinkedHashMap<>();
        int lenmax = 0;
        
        while(sc.hasNextLine()){
            String[] tmp = sc.nextLine().trim().split("\\s+");
            for(String inp : tmp){
                if(isReversable(inp)){
                    if(!lhmap.containsKey(inp)) lhmap.put(inp, 1);
                    else lhmap.put(inp, lhmap.get(inp)+1);
                    if(lenmax < inp.length()) lenmax = inp.length();
                }
            }
        }
        
        for(String item : lhmap.keySet()){
            if(item.length() == lenmax) System.out.println(item + " " + lhmap.get(item));
        }
        
    }
    
}
