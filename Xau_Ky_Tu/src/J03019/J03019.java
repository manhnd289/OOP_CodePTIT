package J03019;

import java.util.Scanner;
import java.util.Stack;

public class J03019 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < arr.length ; i++){
            while(!st.empty() && arr[i] > st.peek()) st.pop();
            st.push(arr[i]);
        }
        System.out.println(st.toString().replaceAll("\\[|\\]|\\s+|,", ""));
        
        
    }
    
}
