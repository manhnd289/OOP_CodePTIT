package J05018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05018 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<BangDiem> arr = new ArrayList<>();
        
        for(int i = 1; i <= n ; i++){
            String name = sc.nextLine();
            String[] mark = sc.nextLine().trim().split("\\s+");
            Double sum = Double.parseDouble(mark[0]) + Double.parseDouble(mark[1]);
            for(String item : mark) sum += Double.parseDouble(item);
            sum /= 12;
            arr.add(new BangDiem(String.format("HS%02d", i), name, sum));
            
        }
        Collections.sort(arr);
        arr.forEach(System.out::println);
        
        
    }
    
}
