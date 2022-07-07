package ru.stqa.sandbox.MyFirstProgram;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class myFirstProgram {
    public static void main(String[] args) {
        String words = "abracadabra";
        hello ("world");
        hello (words);
        hello ("3");

        System.out.println("");

        double l = 2.5;
        System.out.println("площадь квадрата со стороной " + l + " = " + square(l));

        int a,b;
        a = 5;
        b = 2;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + rectangle(a, b));

    }

    public static void hello (String something) {
    System.out.println("Hello " + something + "!");
    }
    public static double square (double Leng){
        return Leng * Leng;
    }

    public static int rectangle (int a, int b){
        return a*b;
    }

}