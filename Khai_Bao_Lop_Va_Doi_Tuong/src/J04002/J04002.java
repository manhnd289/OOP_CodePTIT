package J04002;

import java.util.Scanner;

public class J04002 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] tmp = inp.split(" ");
        Double wid = Double.valueOf(tmp[0]), hei = Double.valueOf(tmp[1]);
        if(wid > 0 && hei > 0){
            Rectangle r = new Rectangle(wid, hei, tmp[2]);
            System.out.println((int)r.findPerimeter() + " " + (int)r.findArea() + " " + r.getColor());
        } else System.out.println("INVALID");
    }
    
}
