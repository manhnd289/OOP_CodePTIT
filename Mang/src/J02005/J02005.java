package J02005;

import java.util.Scanner;
import java.util.TreeSet;

public class J02005 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); 
        int n = sc.nextInt();
        TreeSet<Integer> tset1 = new TreeSet<>();
        TreeSet<Integer> tset2 = new TreeSet<>();
        for(int i = 0 ; i < m ; i++){
            tset1.add(sc.nextInt());
        }
        for(int i = 0 ; i < n ; i++){
            tset2.add(sc.nextInt());
        }
        tset1.retainAll(tset2);
        for(Integer item : tset1){
            System.out.print(item + " ");
        }
    }
            
    
}
