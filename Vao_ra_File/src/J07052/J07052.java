package J07052;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07052 {

    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Candidate> arr = new ArrayList<>();
        
        for(int i = 1 ; i <= t ; i++){
            arr.add(new Candidate(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(arr);
        int target = sc.nextInt();
        Double benchmark;
        if(target >= t) benchmark = arr.get(t-1).getSum_mark();
        else benchmark = arr.get(target-1).getSum_mark();
        
        System.out.println(String.format("%.1f", benchmark));
        
        for(Candidate item : arr){
            System.out.print(item + " ");
            if(item.getSum_mark() >= benchmark) System.out.println("TRUNG TUYEN");
            else System.out.println("TRUOT");
        }
        
    }
    
}
