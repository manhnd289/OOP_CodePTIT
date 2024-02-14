package J05047;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class J05047 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Product> arr = new ArrayList<>();
        HashMap<String,Integer> hmap = new HashMap<>();
        
        while(n-- > 0){
            String name = sc.nextLine();
            int amount = Integer.parseInt(sc.nextLine());
            int price = Integer.parseInt(sc.nextLine());
            String Id = name.substring(0,1).toUpperCase() + name.substring(name.indexOf(" ")+1, name.indexOf(" ")+2).toUpperCase();
            int idx = 0;
            if(hmap.containsKey(Id)){
                hmap.put(Id, hmap.get(Id)+1);
                idx = hmap.get(Id);
            }else{
                hmap.put(Id, 1);
                idx = 1;
            }
            Id += String.format("%02d", idx);
            arr.add(new Product(Id, name, amount, price));
        }
        Collections.sort(arr);
        arr.forEach(System.out::println);
    }
    
}
