package J07057;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class J07057 {

    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = sc.nextInt() ; sc.nextLine();
        ArrayList<ThiSinh> arr = new ArrayList<>();
        
        for(int i = 1 ; i <= n ; i++){
            arr.add(new ThiSinh(String.format("TS%02d", i), sc.nextLine(), Double.parseDouble(sc.nextLine()),
                    sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(arr);
        arr.forEach(System.out::println);
        
    }
    
}
