package J07015;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07015 {
    
    public static int[] prime = new int[10005];
    
    public static void sieve(){
        prime[0] = prime[1] = 0;
        for(int i = 2 ; i <= 10000 ; i++) prime[i] = 1;
        for(int i = 2 ; i <= 100 ; i++){
            if(prime[i] == 1){
                for(int j = i*i ; j <= 10000 ; j+=i) prime[j] = 0;
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        sieve();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) ois.readObject();
        int[] cnt = new int[10005];
        for(Integer item : arr){
            if(prime[item] == 1){
                cnt[item]++;
            }
        }
        for(int i = 0 ; i < 10000 ; i++){
            if(cnt[i] > 0) System.out.println(i + " " + cnt[i]); 
        }
        
    }
    
}
