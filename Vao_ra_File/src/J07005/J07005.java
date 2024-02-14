package J07005;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class J07005 {

    public static void main(String[] args) throws FileNotFoundException,IOException {
        
        DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] map = new int[1005];
        for(int i = 0 ; i < 100000 ; i++){
            map[dis.readInt()]++;
        }
        for(int i = 0 ; i < 1000 ; i++){
            if(map[i] > 0) System.out.println(i + " " + map[i]);
        }
        dis.close();
    }
    
}
