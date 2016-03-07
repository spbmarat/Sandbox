package ru.stqa.fp.sandbox;

public class MyFirstProgram{

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 2;
        p1.y = 4;
        Point p2 = new Point();
        p2.x = 4;
        p2.y = 6;
        System.out.println("Distance between P1(" + p1.x + "," + p1.y + ") and P2(" + p2.x + "," + p2.y + ") = " + distance(p1,p2));
    }

    public static double distance(Point p1, Point p2) {
        return  Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.x - p2.x), 2));
    }
}