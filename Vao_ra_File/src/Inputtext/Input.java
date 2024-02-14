package Inputtext;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Input {

    public static void main(String[] args) throws FileNotFoundException {
        
        PrintWriter pw = new PrintWriter(new File("DATA.in"));
        pw.println("2");
        pw.close();
        
    }
    
}

