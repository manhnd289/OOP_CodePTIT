package J02105;

import java.util.Scanner;

public class J02105 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = 0;
        for(int i = 0 ; i < n ; i++){
            System.out.printf("List(%d) = ", i+1);
            for(int j = 0 ; j < n ; j++){
                tmp = sc.nextInt();
                if(tmp == 1) System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
}
