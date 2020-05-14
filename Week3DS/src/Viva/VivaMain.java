/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viva;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class VivaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(3);
        b.add(1);
        b.add(3);
        b.add(5);
        b.add(8);
        Set z = new Set(a, b);
    }
    
}
