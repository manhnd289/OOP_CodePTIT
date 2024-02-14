package J07059;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07059 {

    public static void main(String[] args) throws FileNotFoundException, FileNotFoundException {
        
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = sc.nextInt(); sc.nextLine();
        ArrayList<CaThi> arr = new ArrayList<>();
        
        for(int i = 1 ; i <= n ; i++){
            arr.add(new CaThi(String.format("C%03d", i), sc.nextLine() + " " + sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        arr.forEach(System.out::println);
        
    }
    
}
