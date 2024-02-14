package J07006;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07006 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) ois.readObject();
        int[] map = new int[1005];
        
        for(Integer item : arr){
            map[item]++;
        }
        
        for(int i = 0 ; i < 1000 ; i++){
            if(map[i] > 0) System.out.println(i + " " + map[i]);
        }
        
        ois.close();
    }
    
}
