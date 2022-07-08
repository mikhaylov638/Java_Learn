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

        Square s = new Square(5); //добавил класс Square с конструктором в класс myFirstProgram
        System.out.println("площадь квадрата со стороной " + s.Leng + " = " + square(s)); //

        Rectangle r = new Rectangle(5, 8);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + rectangle(r));

    }

    public static void hello (String something) {
    System.out.println("Hello " + something + "!");
    }
    public static double square (Square s){
        return s.Leng * s.Leng;
    }

    public static double rectangle (Rectangle r){
        return r.a * r.b;
    }

}