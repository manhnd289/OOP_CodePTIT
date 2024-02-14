package J07056;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07056 {

    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> arr = new ArrayList<>();
        
        for(int i = 1 ; i <= t ; i++){
            arr.add(new Customer(String.format("KH%02d", i), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        arr.forEach(System.out::println);
        
    }
    
}
