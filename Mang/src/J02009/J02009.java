package J02009;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02009 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Check_In> arr = new ArrayList<>();
        
        for(int i = 0 ; i < n ; i++){
            arr.add(new Check_In(sc.nextLong(), sc.nextLong()));
        }
        Collections.sort(arr);
        
        long time_now = arr.get(0).getStart() + arr.get(0).getElapsed();
        
        for(int i = 1 ; i < n ; i++){
            if(time_now < arr.get(i).getStart()) time_now = arr.get(i).getStart();
            time_now += arr.get(i).getElapsed();
        }
        System.out.println(time_now);
        
        
    }
    
}
