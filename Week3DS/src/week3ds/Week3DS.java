/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3ds;

/**
 *
 * @author User
 */
public class Week3DS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int arr[]={4,1,5};
      //display(5);
      writebinary(14);
    }
    //Tuto Soalan 1a
     public int minimum(int a[],int n){
         int ans;
         if(n==1)
             return a[0];
         else{
             ans=minimum(a,n-1);
             if (a[n-1]<ans)
                 return a[n-1];
             else
                 return ans;
         }
     }
     //Tuto soalan 1b
    int a[] = {4, 1, 5};

    public double sum(int a[], int n) {
        if (n == 1) {
            return a[0];
        } else {
            return a[n - 1] + sum(a, n - 1);
        }

    }
    //Tuto soalan 1c
    public int gcd(int x, int y){
        if(y==0)
            return x;
        else
            return gcd(y,x%y);
    }
    
    public static void display(int n){
        if(n<10)
            System.out.println(n);
        else
            display(n/10);
        System.out.println(n%10);
    }
    //Tuto Soalan 1d
    public static void writebinary(int n){
        if (n==0||n==1)
            System.out.println(n);
        else{
            writebinary(n/2);
            System.out.println(n%2);
        }
    }
    //Tuto soalan 1e
    
}
