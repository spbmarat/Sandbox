package ru.stqa.fp.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by marat on 08.03.2016.
 */
public class DistanceTest {
    @Test
    public void testArea(){
        Point p1 = new Point(2,4);
        Point p2 = new Point(4,6);
        Assert.assertEquals(p1.distance(p2),2.8284271247461903);
    }
}
