/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.*;

/**
 *
 * @author User
 */
public class Mainlinklist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        q1();
        q2();

    }

    public static void q1() {

        LinkedList<String> list = new LinkedList<>();
        System.out.println("Linked list : Insert 3 nodes at the back");
        list.addNode("23.1");
        list.addNode("36.5");
        list.addNode("12.8");
        list.addNode("42.6");
        list.addNode("32.8");
        System.out.println("Linked List has " + list.length() + " nodes");
        list.showList();
    }

    public static void q2() {
        LinkedList<Double> list = new LinkedList<>();
        System.out.println("Linked list : Insert 3 nodes at the back");
        list.addNode(23.1);
        list.addNode(36.5);
        list.addNode(12.8);
        list.addNode(42.6);
        list.addNode(32.8);
        list.showList();
        System.out.println("After Update;");
        list.Update();
        list.showList();

    }
    public static void q3(){
        LinkedList<Integer> currencyNotes = new LinkedList<>();
        LinkedList<Integer> numberOfNotes = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        currencyNotes.addNode(100);
        currencyNotes.addNode(50);
        currencyNotes.addNode(20);
        currencyNotes.addNode(10);
        currencyNotes.addNode(5);
        currencyNotes.addNode(1);
               
        System.out.print("Enter the total amount: ");
        int amount= in.nextInt();
        
        for (int i = 0; i < currencyNotes.length(); i++) numberOfNotes.addNode(0); //set semua number of notes to 0 dulu
        int remainder = amount;
        for (int i = 0; i < currencyNotes.length(); i++) {
            int note = currencyNotes.get(i);
            if (remainder > note) {
                numberOfNotes.set(i, remainder / note);
                remainder = amount % note;
            }
        }
        for (int i = 0; i < currencyNotes.length(); i++) {
            System.out.println("MYR "+ currencyNotes.get(i) + " : " + numberOfNotes.get(i));
        }
    }

        
    }
//        Scanner in = new Scanner(System.in);
//        System.out.println("\n Enter a String to search:");
//        String str  = in.nextLine();
//        if(list.contains(str)){
//            System.out.println(str + "was found");
//            
//        }
//        else
//            System.out.println(str+" was not found");
//        
//        System.out.println("Linked List: Delete 2 nodes at the back ");
//        list.deleteNode();
//        list.deleteNode();
//        System.out.println("Linked List has"+ list.length()+" nodes");
//        list.showList();
//        System.out.println("\nLinked List: Clear All");
//        list.clear();
//        System.out.println("Linked List has " +list.length()+" nodes");




