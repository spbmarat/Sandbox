package ru.stqa.fp.sandbox;

/**
 * Created by marat on 07.03.2016.
 */
public class Point {
    public double x;
    public double y;
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    public double distance(Point p2) {
        return  Math.sqrt(Math.pow((this.x - p2.x), 2) + Math.pow((this.y - p2.y), 2));
    }
}

