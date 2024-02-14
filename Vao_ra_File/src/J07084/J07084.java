package J07084;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07084 {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> arr = new ArrayList<>();
        
        while(t-- > 0){
            arr.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        arr.forEach(System.out::println);
    }
    
}
