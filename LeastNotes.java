package com.vivi.com.vivi.dock;

import java.util.Scanner;

public class CurrencyCounter {
    public static void main(String[] args) {
int hundred=0,fifty=0,ten=0,five=0,two=0,one=0,total=0;
        Scanner sc = new Scanner(System.in);
        int cash = sc.nextInt();
        int h= cash/100;
        if(cash>0){
            hundred=cash/100;
            cash -= hundred*100;
        }
        if(cash>0)
        {
            fifty=cash/50;
            cash -= fifty*50;
        }
        if(cash>0) {
            ten = cash / 10;
            cash -= ten * 10;
        }
        if(cash>0){
            five=cash/5;
            cash -=five*5;

        }
        if(cash>0){
            two =cash/2;
            cash -=two*2;
        }
        if(cash>0){
            one=cash;
        }
        total=one+two+five+ten+fifty+hundred;

        System.out.println(total);

    }
}
