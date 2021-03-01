package com.vivi.com.vivi.dock;

import java.util.Scanner;
public class Streak{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int N = sc.nextInt();
        int count=0;
        int b=2;
        int tempcount=0;
        while(b<=N){
            for (int j = 1; j <= N; j++) {
                if(b%j==0){
                count++;
                b++;

                }


                if(count==s){
                    tempcount++;
                }

                break;

        }



b++;
    }
        System.out.println(tempcount);

}
}
