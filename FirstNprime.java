package com.vivi.com.vivi.dock;

import java.util.Scanner;

public class FirstNprime {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x=2;
int i=0;
    while(n>0){
        for(i=2;i<x;i++) {
            if (x % i == 0) {
                break;
            }
        }
            if(i==x){
                System.out.print(x +" ");
                n--;
            }
            x++;
        }

    }
}


