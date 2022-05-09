package org.example;

import java.util.Scanner;

public class Newclass {
    public static void main(String[] args) {
        System.out.println("Enter a number x");
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        System.out.println("Enter a number y");
        Scanner scn1 = new Scanner(System.in);
        int y = scn1.nextInt();


        Greater(x,y);
        System.out.println("Enter the age x");
        Scanner scn2 =new Scanner(System.in);
        int a = scn2.nextInt();
        System.out.println("Enter the age y");
        Scanner scn3=new Scanner(System.in);
        int b = scn3.nextInt();
        System.out.println("Enter the age c");
        Scanner scn4=new Scanner(System.in);
        int c = scn4.nextInt();
        OldAndYoung(a,b,c);
    }
    private static void Greater(int x,int y){

        if(x>y)
            System.out.println("a: is the greater number");
        else
            System.out.println("b: is the greater number");
    }
    private static void OldAndYoung(int a,int b,int c){
        if(a>b && a>c)
            System.out.println("a: older age");
            else
                System.out.println("b: is the youngest");
            if(b>a && b>c)
                System.out.println("a: is the older age");
            else
                System.out.println("b: is the youngest");
            if(c>a && c>b)

                System.out.println("c:is the older age");
            else
                System.out.println("c: is the youngest");

    }

    }

