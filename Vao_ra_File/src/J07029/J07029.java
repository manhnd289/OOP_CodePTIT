package J07029;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;

public class J07029 {
    
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
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) ois.readObject();
        Comparator<Integer> cmp  = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };
        TreeMap<Integer,Integer> tmap = new TreeMap<>(cmp);
        for(Integer item : arr){
            if(prime[item] == 1){
                if(!tmap.containsKey(item)) tmap.put(item, 1);
                else tmap.put(item, tmap.get(item)+1);
            }
        }
        int cnt = 0;
        for(Integer item : tmap.keySet()){
            if(cnt < 10){
                System.out.println(item + " " + tmap.get(item));
                cnt++;
            }else break;
        }
        
    }
    
}
