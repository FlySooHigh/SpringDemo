package org.flysoohigh.beans;

import org.flysoohigh.interfaces.Shape;

public class Circle implements Shape {

    private Point center;
    private double radius;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
        System.out.println("Circle's center is: (" + getCenter().getX() + ", " + getCenter().getY() + ")");
    }
}
