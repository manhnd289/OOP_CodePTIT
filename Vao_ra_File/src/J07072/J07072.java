package J07072;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07072 {

    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<DanhSach> arr = new ArrayList<>();
        
        while(sc.hasNext()){
            arr.add(new DanhSach(sc.nextLine()));
        }
        Collections.sort(arr);
        arr.forEach(System.out::println);
        
    }
    
}
