package J06003;

import java.util.ArrayList;
import java.util.Scanner;

public class J06003 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        
        String id, name, phone;
        int num_group;
        
        ArrayList<Student> arr_stu = new ArrayList<>();
        Exercise.init();
        while(n-- > 0){
            id = sc.nextLine();
            name = sc.nextLine();
            phone = sc.nextLine();
            num_group = Integer.parseInt(sc.nextLine());
            Student tmp = new Student(id, name, phone, num_group);
            arr_stu.add(tmp);
            Exercise.arr[num_group].add(tmp);
        }
        
        ArrayList<String> arr_ex = new ArrayList<>();
        while(m-- > 0){
            arr_ex.add(sc.nextLine());
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            int num = Integer.parseInt(sc.nextLine());
            System.out.println("DANH SACH NHOM " + num + ":");
            for(Student item : Exercise.arr[num]){
                System.out.println(item);
            }
            System.out.println("Bai tap dang ky: " + arr_ex.get(num-1));
        }
        
    }
    
}