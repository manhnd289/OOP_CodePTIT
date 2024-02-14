package JKT013;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JKT013 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Queue<String> q = new LinkedList<>();
        ArrayList<String> arr = new ArrayList<>();
        
        while(t-- > 0){
            int n = sc.nextInt();
            q.add("6");
            q.add("8");
            String tmp = q.poll();
            while(tmp.length() <= n){
                arr.add(tmp);
                q.add(tmp + "6");
                q.add(tmp + "8");
                tmp = q.poll();
            }
            System.out.println(arr.size());
            arr.sort((a,b) -> (b.length() == a.length() ? (b.compareTo(a)) : b.length()-a.length()));
            for(String item : arr){
                System.out.print(item + " ");
            }
            System.out.println();
            q.clear();
            arr.clear();
        }
        sc.close();
        
    }
    
}
