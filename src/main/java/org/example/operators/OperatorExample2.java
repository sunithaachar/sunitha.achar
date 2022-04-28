package org.example;

public class OperatorExample2 {
    public static void main(String args[]) {
        int j = 20, i = 0;
        j = i++ + i++ + ++i + i-- + j++ + i--;
        System.out.print("value of j:" + j);
        System.out.print("value of i:" + i);
    }

}
