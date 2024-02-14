package J01025;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class J01025 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        for(int i = 0 ; i < 4 ; i++){
            x.add(sc.nextInt());
            y.add(sc.nextInt());
        }
        Collections.sort(x);
        Collections.sort(y);
        int edge = Math.max(x.get(3) - x.get(0), y.get(3) - y.get(0));
        System.out.println(edge * edge);
        
        
    }
    
}
