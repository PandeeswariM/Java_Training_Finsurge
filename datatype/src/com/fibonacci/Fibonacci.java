package com.fibonacci;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fibonacci {
    static BigInteger fibonacci(Long num){
        if(num<=1){
            return BigInteger.valueOf(num);
        }
        return fibonacci(num-1).add(fibonacci(num-2));
    }



    static void getnum(){
        Scanner s = new Scanner(System.in);
        try {
            Long num = s.nextLong();
            if (num > Long.MAX_VALUE) {
                System.out.println(fibonacci(num));
            } else if (num > Integer.MAX_VALUE) {
                System.out.println(fibonacci(num));
            }
            int y=num.intValue();
            if(y>0){
                Long l=new Long(y);
                System.out.println(fibonacci(l));
            }
        }catch(Exception e){
            String str = s.nextLine();
            if (!str.matches("\\W\\D"))  //W-except alpha,num //D-except digits
            {
                System.out.println("Enter a valid number ");
                getnum();
            }

        }

    }
    public static void main(String[] args) {

        System.out.println("Enter a number  ");
        getnum();
    }
}
