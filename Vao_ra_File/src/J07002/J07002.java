package J07002;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002 {
    
    public static boolean isValid(String num){
        return num.length() <= 10 && num.matches("-?\\d+");
    }

    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("DATA.in"));
        long res = 0;
        while(sc.hasNext()){
            String[] tmp = sc.nextLine().trim().split("\\s+");
            for(String item : tmp){
                if(isValid(item) && Integer.parseInt(item) <= Integer.MAX_VALUE)
                    res += Integer.parseInt(item);
            }
        }
        System.out.println(res);
        
    }
    
}
