package J05046;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J05046 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> arr = new ArrayList<>();
        HashMap<String, Integer> hmap = new HashMap<>();
        
        for(int i = 1 ; i <= n ; i++){
            String name = sc.nextLine();
            int a = Integer.parseInt(sc.nextLine());
            int b = Integer.parseInt(sc.nextLine());
            int idx = 0;
            String tmp = name.substring(0,1).toUpperCase() + name.substring(name.indexOf(" ")+1, name.indexOf(" ")+2).toUpperCase();
            if(!hmap.containsKey(tmp)){
                hmap.put(tmp, 1);
                idx = 1;
            }else{
                hmap.put(tmp, hmap.get(tmp)+1);
                idx = hmap.get(tmp);
            }
            tmp += String.format("%02d", idx);
            arr.add(new MatHang(tmp, name, a, b));
        }
        arr.forEach(System.out::println);
        
    }
    
}
