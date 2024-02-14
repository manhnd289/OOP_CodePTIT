package J07053;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07053 {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Candidate> arr = new ArrayList<>();
        
        for(int i = 1 ; i <= t ; i++){
            arr.add(new Candidate(String.format("PH%02d", i), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        
        arr.forEach(System.out::println);
        
        
    }
    
}
