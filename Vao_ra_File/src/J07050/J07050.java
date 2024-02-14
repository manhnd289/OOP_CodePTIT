
package J07050;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07050 {

    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Prouduct> arr = new ArrayList<>();
        
        for(int i = 1 ; i <= t ; i++){
            arr.add(new Prouduct(String.format("MH%02d", i), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(arr);
        arr.forEach(System.out::println);
        
    }
    
}
