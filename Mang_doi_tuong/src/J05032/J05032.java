package J05032;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05032 {

    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Person> arr = new ArrayList<>();
        
        while(n-- > 0){
            String[] tmp = sc.nextLine().trim().split("\\s+");
            arr.add(new Person(tmp[0], tmp[1]));
        }
        Collections.sort(arr);
        System.out.println(arr.get(arr.size()-1));
        System.out.println(arr.get(0));
        
    }
    
}
