/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J01001;

import java.util.Scanner;

/**
 *
 * @author manhn
 */
public class J01001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a <= 0 || b <= 0) System.out.println(0);
        else{
            System.out.println(2*(a+b) + " " + a*b);
        }
    }
    
}
