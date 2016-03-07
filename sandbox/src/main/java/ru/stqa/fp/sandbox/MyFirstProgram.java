package ru.stqa.fp.sandbox;

public class MyFirstProgram{

    public static void main(String[] args) {
        Point p1 = new Point(2,4);
        Point p2 = new Point(4,6);
            System.out.println("Distance between P1(" + p1.x + "," + p1.y + ") and P2(" + p2.x + "," + p2.y + ") = " + p1.distance(p2));
    }
}