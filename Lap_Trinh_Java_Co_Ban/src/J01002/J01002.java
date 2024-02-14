/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J01002;

import java.util.Scanner;
import java.util.function.Function;

/**
 *
 * @author manhn
 */
public class J01002 {
    
//    public static long cal(int n){
//        return (1l*n*(n+1))/2;
//    }
    
    static Function<Integer, Long> cal = n -> (1l*n*(n+1))/2;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println(cal.apply(sc.nextInt()));
        }
    }
}
