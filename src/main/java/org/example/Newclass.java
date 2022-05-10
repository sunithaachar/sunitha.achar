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
        System.out.println("Enter the age a");
        Scanner scn2 =new Scanner(System.in);
        int a = scn2.nextInt();
        System.out.println("Enter the age b");
        Scanner scn3=new Scanner(System.in);
        int b = scn3.nextInt();
        System.out.println("Enter the age c");
        Scanner scn4=new Scanner(System.in);
        int c = scn4.nextInt();
        OldAndYoung(a,b,c,0,0);
        System.out.println("Enter the length of a Rectangle:l");
        Scanner scn5=new Scanner(System.in);
        int l= scn5.nextInt();
        System.out.println("Enter the breadth of a Rectangle:w");
        Scanner scn6=new Scanner(System.in);
        int w =scn6.nextInt();
        LengthAndBreadth(l,w);
    }
    private static void Greater(int x,int y){

        if(x>y)
            System.out.println("x: is the greater number");
        else
            System.out.println("y: is the greater number");
    }
    private static <Char> void OldAndYoung(int a, int b, int c,int  E, int Y) {
        // if(a>b && a>c)
        //    System.out.println("a: older age");
        //    else
        //       System.out.println("b: is the youngest");
        // if(b>a && b>c)
        //   System.out.println("a: is the older age");
        //else
        //  System.out.println("b: is the youngest");
        //if(c>a && c>b)

        //  System.out.println("c:is the older age");
        //else
        //  System.out.println("c: is the youngest");

        if (a > b) {
            E = a;
            Y = b;
        } else {
            E = b;
            Y = a;
        }

        if (c > E) {
            E = c;
        }
        if (c < Y) {
            Y = c;
        }

        System.out.println("Eldest is: " + E);
        //   System.out.println(E);
        System.out.println("Youngest is:" + Y);
        //  System.out.println(Y);
    }
    private static void LengthAndBreadth(int l, int w)
        {
            if (l == w)
                System.out.println("Its a square");
            else
                System.out.println("Its not a square");
        }



    }

