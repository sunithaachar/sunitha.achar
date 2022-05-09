package org.example;

import java.util.Scanner;

public class Newclass {
    public static void main(String[] args) {
        System.out.println("Enter a number a");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        System.out.println("Enter a number b");
        Scanner scn1 = new Scanner(System.in);
        int b = scn1.nextInt();


        Greater(a,b);
    }
    private static void Greater(int x,int y){

        if(x>y)
            System.out.println("a: is the greater number");
        else
            System.out.println("b: is the greater number");
    }

    }

