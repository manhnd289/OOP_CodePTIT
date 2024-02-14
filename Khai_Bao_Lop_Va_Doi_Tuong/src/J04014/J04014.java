package J04014;

import java.util.Scanner;

public class J04014 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            PhanSo inp1 = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo inp2 = new PhanSo(sc.nextLong(), sc.nextLong()); 
            PhanSo res1 = PhanSo.add(inp1, inp2);
            res1 = PhanSo.mul(res1, res1);
            PhanSo res2 = PhanSo.mul(PhanSo.mul(inp1, inp2), res1);
            System.out.println(res1 + " " + res2);
            
        }
        
    }
    
}
