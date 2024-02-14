package J07032;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07032 {
    
    public static boolean isReversable(Integer n){
        String s1 = n.toString();
        String s2 = new StringBuilder(s1).reverse().toString();
        return s1.length() > 1 && s1.length()%2==1 && s1.equals(s2) && s1.matches("^[13579]+$");
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>)ois1.readObject();
        
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr2 = (ArrayList<Integer>)ois2.readObject();
        
        int[] cnt1 = new int[1000006];
        arr1.forEach(e -> cnt1[e]++);
        
        int[] cnt2 = new int[1000006];
        arr2.forEach(e -> cnt2[e]++);
        
        int cnt = 0;
        
        for(int i = 0 ; i < 1000000 ; i++){
            if(cnt1[i] >= 1 && cnt2[i] >= 1 && cnt < 10 && isReversable(i)){
                System.out.println(i + " " + (cnt1[i] + cnt2[i]));
                cnt++;
            }
        }
        
    }
    
}
