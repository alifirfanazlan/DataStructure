/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viva;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author User
 */
public class Set<T> {
    private ArrayList<Integer> a;
    private ArrayList<Integer> b;
    
    public Set(ArrayList<Integer> a, ArrayList<Integer> b) {
        this.a = a;
        this.b = b;
        System.out.println(this.a);
        System.out.println(this.b);
        union();
        intersection();
    }
    

    public ArrayList<Integer> union() {
        ArrayList<T> c= new ArrayList<T>();
        c.addAll((Collection<? extends T>) a);
        c.addAll((Collection<? extends T>) b);
        
        for (int i = 0; i < c.size(); i++) {
            int z=(int) c.get(i);
            for (int j = i+1; j < c.size()-1; j++) {
                if (z==(int) c.get(j)) {
                    c.remove(j);
                }              
            }
        }
        
        System.out.println(c);
        return (ArrayList<Integer>) c;
    }

    public ArrayList<Integer> intersection() {
        ArrayList<T> d= new ArrayList<T>();
        for (int i = 0; i < a.size(); i++) {
            if (a.contains(b.get(i))) {
                d.add((T) b.get(i));
            }
        }
        System.out.println(d);
        return (ArrayList<Integer>) d;
    }
    
//    public ArrayList<Integer> complement() {
//        if
//        
//        
//    }
  
    
    
   
}
