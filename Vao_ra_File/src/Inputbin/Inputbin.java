package Inputbin;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Inputbin {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        writeObject();
        
    }
    
    public static void writeObject() throws FileNotFoundException, IOException{
        
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(11311, 11311, 939));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("DATA2.in"));
        oos.writeObject(arr);
        oos.close();
        
    }
    
    public static void writeData() throws FileNotFoundException, IOException{
        
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("DATA.IN"));
        int[] a = {10,10,21,25,25,25,25};
        for(int number : a) dos.writeInt(number);
        dos.close();
        
    }
    
}
