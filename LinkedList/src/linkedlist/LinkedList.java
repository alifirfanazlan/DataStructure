/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author User
 */
public class LinkedList<T extends Comparable<T>> {

    private ListNode head;

    public LinkedList() {
        head = null;
    }

    public int length() {
        int count = 0;
        ListNode currentNode = head;
        while (currentNode != null) {
            currentNode = currentNode.getLink();
            count++;
        }
        return count;
    }

    public void clear() {
        head = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void showList() {
        ListNode currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.toString());
            currentNode = currentNode.getLink();

        }
    }

    public void addNode(T a) {
        ListNode newNode = new ListNode(a, null);
        ListNode currentNode = head;
        if (head == null) {
            head = newNode;

        } else {
            while (currentNode.getLink() != null) {
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
        }
    }

    public void deleteNode() {
        ListNode currentNode = head;
        ListNode previousNode = head;
        if (head != null) {
            if (currentNode.getLink() == null) {
                head = null;
            } else {
                while (currentNode.getLink() != null) {
                    previousNode = currentNode;
                    currentNode = currentNode.getLink();
                }
                previousNode.setLink(null);
            }

        } else {
            System.out.println("The list is empty");
        }
    }

    public void addFrontNode(T a) {
        head = new ListNode(a, head);

    }

    public void deleteFrontNode() {
        if (head != null) {
            head = head.getLink();
        } else {
            System.out.println("The List is Empty");
        }

    }

    public boolean contains(T t) {
        boolean found = false;
        ListNode currentNode = head;
        while (currentNode != null) {
            if (t.compareTo((T) currentNode.getData()) == 0) {
                found = true;
                break;
            }
            currentNode = currentNode.getLink();
        }
        return found;
    }
    public void Update(){// soalan 2 tuto
        ListNode currentNode = head;
        double y;
        while (currentNode != null) {
             y = (double) currentNode.getData();
            if (y>20) {
                y+=10.5;
                currentNode.setData( y);
            }
            currentNode= currentNode.getLink();
        }
    }
    public T get(int index) {
        if (index >= length() || index < 0 || head == null) {
            return  null;
        } else {
            int count = 0;
            ListNode currentNode = head;
            while (currentNode.getLink() != null && count != index) {
                currentNode = currentNode.getLink();
                count++;
            }
            return (T) currentNode.getData();
        }
    }
    public void set(int index, T data) {
        if (index >= length() || index < 0 || head == null) {
            return;
        } else {
            int count = 0;
            ListNode currentNode = head;
            while (currentNode.getLink() != null && count != index) {
                currentNode = currentNode.getLink();
                count++;
            }
            currentNode.setData(data);
        }
    }
}
