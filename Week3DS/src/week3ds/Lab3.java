/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3ds;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // n(n-1)/2
        System.out.println("Mesh topology");
        System.out.println("Enter number of switch:");
        Scanner in= new Scanner(System.in);
        int x = in.nextInt();
        //q1 a = new q1();
        System.out.println(mesh(x));
    }
    public static int mesh(int num){
        int ans = num*(num-1)/2;
        
        return ans;
    }
}
