package J05082;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05082 {

    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> arr = new ArrayList<>();
        
        for(int i = 1 ; i <= t ; i++){
            arr.add(new Customer(String.format("KH%03d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        arr.forEach(System.out::println);
        
    }
    
}
