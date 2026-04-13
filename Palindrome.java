package org.example;

import java.util.Scanner;

public class Main {

    public static void isPalindrome(int[]a){

        int original;


        for (int i=0;i<a.length;i++){
            original=a[i];
            int reverse=0;
            while(a[i]>0){
                int digit=a[i]%10;
                reverse=reverse*10+ digit;
                a[i] = a[i]/10;

            }
            if(original==reverse){
                System.out.println(original);
            }

        }
    }




    public static void main(String[] args) {

        int arr[]= {121,432,535,986,222};

        isPalindrome(arr);



    }
}







