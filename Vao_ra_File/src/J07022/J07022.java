package J07022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07022 {

    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("DATA.in"));
        String inp = "";
        String[] tmp;
        ArrayList<String> arr = new ArrayList<>();
        int num;
        while(sc.hasNextLine()){
            inp = sc.nextLine();
            tmp = inp.trim().split("\\s+");
            for(String item : tmp){
                try{
                    num = Integer.parseInt(item);
                } catch (NumberFormatException e){
                    arr.add(item);
                }
            }
        }
        Collections.sort(arr);
        for(String item : arr){
            System.out.print(item + " ");
        }
        System.out.println();
        
    }
    
}
