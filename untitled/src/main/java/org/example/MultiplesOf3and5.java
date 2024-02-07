package org.example;

public class MultiplesOf3and5 {


    public static void main(String[] args) {

        multiplsOf_3and5(1000);



    }

static void multiplsOf_3and5(int number) {
    int sum = 0;
    for (int i = 1; i < 1000; i++) {
        if (i % 3 == 0 || i % 5 == 0) {
            sum += i;
        }
    }
    System.out.print(sum);
    }


}