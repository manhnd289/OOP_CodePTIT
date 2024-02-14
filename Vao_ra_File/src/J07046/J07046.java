
package J07046;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07046 {
    
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        
        Scanner sc = new Scanner(new File("KHACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> arr = new ArrayList<>();
        
        for(int i = 1 ; i <= t ; i++){
            arr.add(new Customer(String.format("KH%02d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        arr.forEach(System.out::println);
        
    }

}
