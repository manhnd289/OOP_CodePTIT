package J07034;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07034 {

    public static void main(String[] args) throws FileNotFoundException{
        
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = sc.nextInt(); sc.nextLine();
        MonHoc mh;
        ArrayList<MonHoc> arr = new ArrayList<>();
        
        while(t-- > 0){
            mh = new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(mh);
        }
        Collections.sort(arr);
        for(MonHoc item : arr) System.out.println(item);
    }
    
}
