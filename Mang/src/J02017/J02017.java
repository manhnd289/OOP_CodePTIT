package J02017;

import java.util.Scanner;
import java.util.Stack;

public class J02017 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < n ; i++){
            if(st.isEmpty()) st.add(sc.nextInt());
            else{
                int tmp = sc.nextInt();
                if((tmp + st.peek()) % 2 == 0){
                    st.pop();
                }
                else st.push(tmp);
            }
        }
        System.out.println(st.size());
        
    }
    
}
