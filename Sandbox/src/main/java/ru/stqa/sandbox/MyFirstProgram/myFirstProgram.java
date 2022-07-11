package ru.stqa.sandbox.MyFirstProgram;

public class myFirstProgram {
    public static void main(String[] args) {
        Hello h = new Hello("");
        h.hello ("world");
        h.hello ("words");
        h.hello ("3");

        System.out.println("");

        Square s = new Square(10); //добавил класс Square с конструктором в класс myFirstProgram
        System.out.println("площадь квадрата со стороной " + s.Leng + " = " + s.area()); //

        Rectangle r = new Rectangle(5, 10);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
    }
}