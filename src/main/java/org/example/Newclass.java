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
        System.out.println("Enter the age c");
        Scanner scn2 =new Scanner(System.in);
        int c = scn2.nextInt();
        System.out.println("Enter the age d");
        Scanner scn3=new Scanner(System.in);
        int d = scn3.nextInt();
        System.out.println("Enter the age e");
        Scanner scn4=new Scanner(System.in);
        int e = scn4.nextInt();
        OldAndYoung(c,d,e);
    }
    private static void Greater(int x,int y){

        if(x>y)
            System.out.println("a: is the greater number");
        else
            System.out.println("b: is the greater number");
    }
    private static void OldAndYoung(int k,int g,int f){
        if(k>g && k>f)
            System.out.println("k: older age");
            else
                System.out.println("K: is the youngest");
            if(g>k && g>f)
                System.out.println("g: is the older age");
            else
                System.out.println("g: is the youngest");
            if(f>k && f>g)

                System.out.println("f:is the older age");
            else
                System.out.println("f: is the youngest");

    }

    }

