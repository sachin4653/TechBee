package com.vivi.com.vivi.dock;

import java.util.Scanner;
class prog {

    public void display() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        int fact=1;
        while(a>0) {
            fact = fact * a;
            a--;
        }
        System.out.println(fact);


    }
}

    public class Factorial {

        public static void main(String[] args) {
            prog p = new prog();
            p.display();
        }
    }






