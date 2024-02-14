package J02016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02016 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n, i, j, k;
        long tmp;
        boolean isValid = false;
        ArrayList<Long> arr = new ArrayList<>();
        
        while(t-- > 0){
            n = sc.nextInt();
            for(int i1 = 0 ; i1 < n ; i1++){
                tmp = sc.nextLong();
                arr.add(tmp*tmp);
            }
            if(n >= 3){
                Collections.sort(arr);
                isValid = false;
                i = n-1; j = i-1; k = 0;
                while(j > k){
                    if(arr.get(i) == arr.get(j) + arr.get(k)){
                        isValid = true; break;
                    }
                    else if(arr.get(i) > arr.get(j) + arr.get(k)) k++;
                    else j--;
                    if(j == k){
                        i--; j = i-1; k = 0;
                    }
                }
                System.out.println(isValid ? "YES" : "NO");
            }
            else System.out.println("NO");
            arr.clear();
        }
        
        
    }
    
}
