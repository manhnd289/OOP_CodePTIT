package J02006;

import java.util.Scanner;
import java.util.TreeSet;

public class J02006 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        TreeSet<Integer> tset = new TreeSet<>();
        
        for(int i = 0 ; i < m+n ; i++){
            tset.add(sc.nextInt());
        }
        tset.forEach(e -> System.out.print(e + " "));
        
    }
    
}
