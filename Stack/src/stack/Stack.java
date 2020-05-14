/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author User
 */
public class Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        q1();
    }
    public static void q1(){
        Stack1<String> stack = new Stack1<>();
        System.out.println("Insert Nodes to the stack");
        stack.push("Satu");
        stack.push("Dua");
        stack.push("Tiga");
        System.out.println(stack.getSize());
        System.out.println(stack.pop());
        stack.showStack();
    }
    public static void q2(){
        
    }
}
