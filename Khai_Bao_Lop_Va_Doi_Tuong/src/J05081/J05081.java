package J05081;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05081 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        ArrayList<MatHang> arr = new ArrayList<>();
        MatHang mh;
        int tmp = 1;
        
        while(t-- > 0){
            mh = new MatHang(String.format("MH%03d", tmp++), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(mh);
        }
        Collections.sort(arr);
        for(MatHang item : arr){
            System.out.println(item);
        }
    }
    
}
