package J07021;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07021 {

    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("DATA.in"));
        String inp = "";
        String[] tmp;
        StringBuilder sb = new StringBuilder("");
        while(sc.hasNextLine()){
            sb = new StringBuilder("");
            inp = sc.nextLine();
            if(inp.equals("END")) break;
            tmp = inp.trim().toLowerCase().split("\\s+");
            for(String item : tmp){
                sb.append(item.substring(0, 1).toUpperCase() + item.substring(1) + " ");
            }
            System.out.println(sb.toString());
        }
    }
    
}
