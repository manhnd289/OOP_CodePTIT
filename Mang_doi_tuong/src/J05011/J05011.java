package J05011;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05011 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> arr = new ArrayList<>();
        
        while(t-- > 0){
            arr.add(new Customer(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        arr.forEach(System.out::println);
        
    }
    
}
