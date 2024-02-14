package J07031;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class J07031 {
    
    public static int[] prime = new int[1000005];
    public static void sieve(){
        for(int i = 2 ; i <= 1000000 ; i++) prime[i] = 1;
        for(int i = 2 ; i <= 1000 ; i++){
            if(prime[i] == 1){
                for(int j = i*i ; j <= 1000000 ; j+=i) prime[j] = 0;
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        sieve();
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) ois1.readObject();
        TreeSet<Integer> tset1 = new TreeSet<>(arr1);
        
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr2 = (ArrayList<Integer>) ois2.readObject();
        TreeSet<Integer> tset2 = new TreeSet<>(arr2);
        tset1.removeAll(tset2);
        
        for(Integer item : tset1){
            if(item < 1000000-item && prime[item] == 1 && prime[1000000-item] == 1 && tset1.contains(1000000-item)) System.out.println(item + " " + (1000000-item));
        }
        
        
    }
    
}
