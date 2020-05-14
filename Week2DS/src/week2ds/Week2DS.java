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
public class Week2DS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        generic("Hello","World");
        generic(12.4,64.3);
        generic(20,35);
        generic("Welcome","Welcome");
        
    }
    public static<T,U>void generic(T t ,U u){
        System.out.println("THe Parameter values are:"+t+" and "+u);
        if ((t instanceof Integer)&&(u instanceof Integer)) {
            System.out.println("The Sum is "+t+u);
            
        }
        else if((t instanceof Double)&&(u instanceof Double)) {
            System.out.println("The Sum is "+(Double)t+(Double)u);
            
    }
        else if((t instanceof String)&&(u instanceof String)) {
            System.out.println("The Sum is "+(String)t+(String)u);
        }
}}
