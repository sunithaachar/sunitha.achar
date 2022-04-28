package org.example;

public class OperatorExample1 {

    public static void main(String args[]){
        int j=0,i=0;
        j=i++ +i++ + ++i +i-- + i + j++ + i-- ;
        System.out.print("value of j:"+j);
        System.out.print("value of i:"+i);
    }

}
