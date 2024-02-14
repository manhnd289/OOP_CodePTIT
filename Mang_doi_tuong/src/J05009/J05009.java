package J05009;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05009 {

    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> arr = new ArrayList<>();
        
        for(int i = 1 ; i <= n ; i++){
            arr.add(new ThiSinh(i, sc.nextLine(), sc.nextLine(), Double.valueOf(sc.nextLine()), Double.valueOf(sc.nextLine()), Double.valueOf(sc.nextLine()) ));
        }
        Collections.sort(arr);
        Double tmp = arr.get(arr.size()-1).getTotal();
        for(ThiSinh item : arr){
            if(item.getTotal().equals(tmp)) System.out.println(item);
        }
        
    }
    
}
