package J07076;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07076 {

    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        int n,m,col;
        
        while(t-- > 0){
            n = sc.nextInt();
            m = sc.nextInt();
            col = sc.nextInt(); sc.nextLine();
            String data = sc.nextLine();
            System.out.println(new Matrix(n,m,col-1,data));
        }
        
    }
    
}
