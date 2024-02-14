package J07055;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07055 {

    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> arr = new ArrayList<>();
        
        for(int i = 1 ; i <= t ; i++){
            arr.add(new Student(String.format("SV%02d", i), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(arr);
        arr.forEach(System.out::println);
        
    }
    
}
