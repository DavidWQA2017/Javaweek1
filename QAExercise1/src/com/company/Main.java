package com.company;


import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;
import javafx.scene.shape.ClosePathBuilder;
import java.util.Scanner;

public class Main {
    public static void Exercise1a() {
        System.out.println("Hello World");
    }

    public static void Exercise1b() {
        String Output = "Hello World";
        System.out.print(Output);
    }

    public static String Exercise1c() {
        String helloWorld = "Hello World";
        return helloWorld;
    }

    public static int Exercise1d(int a, int b) {
        int c = a + b;
        return c;
    }

    public static int Multiply(int a, int b) {
        return a * b;
    }

    public static int Exercise1e(int a, int b, Boolean Check) {
        int c;

        if (Check == true) {
            c = Exercise1d(a, b);

        } else {
            c = Multiply(a, b);
        }

        return c;
    }

    public static int Exercise1f(int a, int b, boolean Check) {
        int c;
        if (a == 0 || b == 0) {
            c = a + b;
        } else {
            c = Exercise1e(a, b, Check);
        }


        return c;
    }

    public static void Exercise1G(int a, int b, Boolean Check) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(Exercise1f(a, b, Check));
        }
    }

    public static int[] Exercise1HI(int a, int b, boolean Check) {
        int[] integersValues = new int[10];

        for (int i = 0; i < integersValues.length; i++) {
            integersValues[i] = Exercise1f(a, b, Check);
        }

        for (int i : integersValues) {
            System.out.println(integersValues[i]);
        }

        return integersValues;
    }

    public static void Exercise1J(int[] integersValues)
    {

        for (int i : integersValues)
        {
            System.out.println(integersValues[i] *10);
        }
    }

    public static void main(String[] args) {
        int a = 0 , b = 2;
        boolean Check = false;
        int[] integersValues = new int[10];
        //Exercise1a();
        //Exercise1b();
        //System.out.print(Exercise1c());
        //System.out.print(Exercise1d(a,b));
        //System.out.print(Exercise1e(a, b , Check));
        //System.out.print(Exercise1f(a, b , Check));
        //Exercise1G(a, b, Check);
        Exercise1HI(a, b, Check);
        integersValues = Exercise1HI(a, b, Check);
        Exercise1J(integersValues);


    }
}


