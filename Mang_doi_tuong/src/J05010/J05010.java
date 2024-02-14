package J05010;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05010 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Mat_Hang> arr = new ArrayList<>();
        
        for(int i = 1 ; i <= n ; i++){
            arr.add(new Mat_Hang(i, sc.nextLine(), sc.nextLine(),Double.valueOf(sc.nextLine()),Double.valueOf(sc.nextLine())));
        }
        Collections.sort(arr);
        arr.forEach(System.out::println);
        
    }
    
}
