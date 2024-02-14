package J04001;

import java.util.Scanner;

public class J04001 {

    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        
        while(t-- > 0){
            Point p1 = new Point(inp.nextDouble(), inp.nextDouble());
            Point p2 = new Point(inp.nextDouble(), inp.nextDouble());
            System.out.printf("%.4f", p1.distance(p2));
            System.out.println();
        }
        
    }
    
}
