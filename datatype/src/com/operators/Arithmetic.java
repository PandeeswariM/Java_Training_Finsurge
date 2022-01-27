package Operators;

import java.util.Arrays;

public class Arithmetic {
    static int a,b;
    Arithmetic(int a,int b){
        Arithmetic.a =a;
        Arithmetic.b =b;
    }
    //  + operator
    static int add(){
        return a+b;
    }

    // - operator
    static int sub(){
        return a-b;
    }

    // * operator
    static int mul(){
        return a*b;
    }

    // / operator
    static int div(){
        return a/b;
    }

    // % operator
    static int mod(){
        return a%b;
    }

    public static void main(String[] args) {
        Arithmetic obj=new Arithmetic(4,4);
        System.out.println(add());
        System.out.println(sub());
        System.out.println(mul());
        System.out.println(div());
        System.out.println(mod());
    }
}

