package org.example;

public class Calculator3 {
    public boolean isTriangle(int a, int b, int c) {
        int sum_1= a + b;
        int sum_2 =a + c;
        int sum_3 =b + c;
        if (sum_1 > c && sum_2 > b && sum_3 > a) {
            return true;
        } else {
            return false;
        }


    }
}
