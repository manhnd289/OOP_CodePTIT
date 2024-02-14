package J05024;

import java.util.ArrayList;
import java.util.Scanner;

public class J05024 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> arr = new ArrayList<>();
        
        while(t-- > 0){
            arr.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String inp = sc.nextLine().toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + inp + ":");
            for(Student item : arr){
                if(item.getCarrer().equals(inp)){
                    System.out.println(item);
                }
            }
        }
        
    }
    
}
