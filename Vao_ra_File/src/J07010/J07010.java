
package J07010;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

public class J07010 {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        
        Scanner sc = new Scanner(new File("SV.in"));
        int t = Integer.parseInt(sc.nextLine());
        
        for(int i = 1 ; i <= t ; i++){
            System.out.println(new Student(String.format("B20DCCN%03d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }
        
    }
    
}
