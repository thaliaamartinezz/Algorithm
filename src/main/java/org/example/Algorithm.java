package org.example;

import java.util.HashMap;
import java.util.Map;

public class Algorithm {

    private static Map<Integer, Long> dictionary = new HashMap<>();

    public static long fib(int n) {
        if(n == 0){
            return 0L;
        }

        if(n ==1){
            return 1l;
        }

        return fib(n-1)+ fib(n-2);
    }

    private static long memo(int m){
        Long value = dictionary.get(m);

        if (value != null){
            return value;
        }

        value = fib(m);
    }
    public static void main(String[] args) {
        System.out.println(Algorithm.fib(5));
        System.out.println(Algorithm.fib(10));
        System.out.println(Algorithm.fib(20));
    }
}
