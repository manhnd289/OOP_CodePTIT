package J07004;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class J07004 {

    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("DATA.in"));
        TreeMap<Integer, Integer> tmap = new TreeMap<>();
        
        while(sc.hasNext()){
            Integer num = sc.nextInt();
            if(tmap.containsKey(num)) tmap.put(num, tmap.get(num)+1);
            else tmap.put(num, 1);
        }
        
        for(Integer item : tmap.keySet()){
            System.out.println(item + " " + tmap.get(item));
        }
        
    }
    
}
