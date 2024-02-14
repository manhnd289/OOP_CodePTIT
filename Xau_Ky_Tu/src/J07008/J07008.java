package J07008;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07008 {
    
    static int[] tmp = new int[25];
    static ArrayList<Integer> arr_inp = new ArrayList<>();
    static ArrayList<String> res = new ArrayList<>();
    static int n;
    
    public static void Try(int i){
        for(int j = 0 ; j <= 1 ; j++){
            tmp[i] = j;
            if(i == n-1) Out();
            else Try(i+1);
        }
    }
    
    public static void Out(){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            if(tmp[i] == 1) arr.add(arr_inp.get(i));
        }
        if(arr.size() <= 1) return;
        for(int i = 1 ; i < arr.size() ; i++){
            if(arr.get(i) <= arr.get(i-1)) return;
        }
        String tmp = "";
        for(Integer item : arr) tmp += item + " ";
        res.add(tmp);
    }

    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = sc.nextInt();
        
        for(int i = 0 ; i < n ; i++) arr_inp.add(sc.nextInt());
        Try(0);
        Collections.sort(res);
        res.forEach(System.out::println);
        
    }
    
}
