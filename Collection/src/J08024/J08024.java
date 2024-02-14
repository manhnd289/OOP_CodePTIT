package J08024;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J08024 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        Queue<String> q = new LinkedList<>();
        
        while(t-- > 0){
            int n = sc.nextInt();
            q.add("9");
            String tmp = q.poll();
            while(Long.parseLong(tmp) % n != 0){
                q.add(tmp + "0");
                q.add(tmp + "9");
                tmp = q.poll();
            }
            System.out.println(tmp);
            q.clear();
        }
        sc.close();
        
    }
    
}
