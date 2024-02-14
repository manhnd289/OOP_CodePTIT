package J07007;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {

    private String fileName;

    public WordSet(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString(){
        
        try {
            Scanner sc = new Scanner(new File(fileName));
            TreeSet<String> tset = new TreeSet<>();
            while(sc.hasNextLine()){
                String[] inp = sc.nextLine().trim().toLowerCase().split("\\s+");
                for(String item : inp) tset.add(item);
            }
            tset.forEach(System.out::println);
            
        } catch (FileNotFoundException ex) {}
        
        return "";
        
    }
    
    
    
}
