package org.example;

public class OperatorExample3 {
    public static void main(String args[]){

        int j = 0 ,a=5,b=8;
        j = a++ + b +b-- - --b - --a - 9 - --b + j++;
        System.out.print("value of j:" + j);
        System.out.print("value of a:" + a);
        System.out.print("value of a:" + b);


    }
}
