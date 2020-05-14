/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2ds;

/**
 *
 * @author User
 */
public class Tuto2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("The Number are: 123 22 13");
        maximum(123,22,13);
    }
    public static<T extends Comparable> void maximum(T a,T b,T c){
        if (a.compareTo(b)<=0) {
            if (b.compareTo(c)<0) {
                System.out.println(c);
                
            }
            else
                System.out.println(b);
        }
        else
            if (a.compareTo(c)<=0) {
                System.out.println(c);
        }
            else
                System.out.println(a);
}   
    
}
