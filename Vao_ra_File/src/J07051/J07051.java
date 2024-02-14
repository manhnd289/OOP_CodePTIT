package J07051;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07051 {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> arr = new ArrayList<>();
        
        for(int i = 1 ; i <= t ; i++){
            arr.add(new Customer(String.format("KH%02d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(arr);
        arr.forEach(System.out::println);
        
    }
    
}
