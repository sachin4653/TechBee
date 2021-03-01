import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
       
         if(a%8==1)
         {
             String l = "LB";
             System.out.println((a+3)+l);
         }
         if(a%8==4)
         {
             String l= "LB";
             System.out.println((a-3)+l);
         }
         if(a%8==2)
         {
             String m = "MB";
             System.out.println((a+3)+m);
         }
         if(a%8==5)
         {
             String m = "MB";
             System.out.println((a-3)+m);
         }
         if(a%8==3)
         {
             String u = "UB";
             System.out.println((a+3)+u);
         }
         if(a%8==6)
         {
             String u = "UB";
             System.out.println((a-3)+u);
         }
         if(a%8==7){
             String su="SU";
             System.out.println((a+1)+su);
         }
         if(a%8==0){
             String sl = "SL";
             System.out.println((a-1)+sl);
         }
        
     }
 }


// version 2:
package com.vivi.com.vivi.dock;

/* import java.util.Hashtable;
import java.util.Scanner;

public class NeighbourSeat {



    public static void main(String[] args) {
        Hashtable<Integer, String> d = new Hashtable<Integer, String>();
        int q = 0, a = 0;
        d.put(1, "LB");
        d.put(2, "MB");
        d.put(3, "UB");
        d.put(4, "LB");
        d.put(5, "MB");
        d.put(6, "UB");
        d.put(7, "SL");
        d.put(8, "SU");
        Scanner sc = new Scanner(System.in);
         a = sc.nextInt();


            if (a > 3 && a < 7) {
                int num = a - 3;

                System.out.println((num) + d.get(num));
            }
            if (a <= 3) {
                int k = a + 3;
                System.out.println(k + d.get(k));
            }
            if (a == 7) {
                System.out.println(8 + d.get(8));
            }
            if (a == 8) {
                System.out.println(7 + d.get(7));
            }
        }
    }

 */

import java.util.Hashtable;
import java.util.Scanner;

public class NeighbourSeat {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         Hashtable<Integer, String> d = new Hashtable<Integer, String>();

         d.put(1, "LB");
         d.put(2, "MB");
         d.put(3, "UB");
         d.put(4, "LB");
         d.put(5, "MB");
         d.put(6, "UB");
         d.put(7, "SL");
         d.put(8, "SU");

        int t = a%8;
         switch (t) {
             case 1 -> {
                 a = a + 3;
                 System.out.println(a + d.get(t));
             }
             case 2 -> {
                 a = a + 3;
                 System.out.println(a + d.get(t));
             }
             case 3 -> {
                 a = a + 3;
                 System.out.println(a + d.get(t));
             }
             case 4 -> {
                 a = a - 3;
                 System.out.println(a + d.get(t));
             }
             case 5 -> {
                 a = a - 3;
                 System.out.println(a + d.get(t));
             }
             case 6 -> {
                 a = a - 3;
                 System.out.println(a + d.get(t));
             }
             case 7 ->{
                 a = a+1;
                 System.out.println(a+ d.get(t));
             }
             case 0 ->{
                 a = a-1;
                 System.out.println(a+ d.get(t));
             }
         }
     }
 }

