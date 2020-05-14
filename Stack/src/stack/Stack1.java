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
public class Stack1<T> {
    private ListNode head;

    public Stack1() {
        head = null;
    }
    
    public boolean isEmpty(){
        return(head==null);
    }
   public int getSize(){
       int count =0;
       ListNode currentNode= head;
       while(currentNode!=null){
           currentNode= currentNode.getLink();
           count++;
       }
       return count;
   }
   public void push ( T a){
       head = new ListNode(a,head);
   }
   public T pop(){
       if (head == null)
           return null;
       T temp = (T) head.getData();
       head = head.getLink();
       return temp;
   }
   public T peek(){
       if( head == null)
           return null;
       else
           return (T)head.getData();
   }
   public void showStack(){
       if (isEmpty())
           System.out.println("Empty Stack");
       else{
           ListNode currentNode= head;
           while (currentNode!=null){
               System.out.print(currentNode.toString());
               currentNode= currentNode.getLink();
           }
       }
   }
 
}
