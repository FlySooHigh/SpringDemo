package org.flysoohigh.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class Triangle implements InitializingBean, DisposableBean{

//    private Point pointA;
//    private Point pointB;
//    private Point pointC;
    private List<Point> points;

//    public Point getPointA() {
//        return pointA;
//    }
//
//    public void setPointA(Point pointA) {
//        this.pointA = pointA;
//    }
//
//    public Point getPointB() {
//        return pointB;
//    }
//
//    public void setPointB(Point pointB) {
//        this.pointB = pointB;
//    }
//
//    public Point getPointC() {
//        return pointC;
//    }
//
//    public void setPointC(Point pointC) {
//        this.pointC = pointC;
//    }


    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void draw() {
        for (Point point: points) {
            System.out.println("Point: (" + point.getX() + ", " + point.getY() + ")");
        }
        System.out.println(points.getClass());

//        System.out.println("PointA: (" + getPointA().getX() + ", " + getPointA().getY() + ")");
//        System.out.println("PointB: (" + getPointB().getX() + ", " + getPointB().getY() + ")");
//        System.out.println("PointA: (" + getPointC().getX() + ", " + getPointC().getY() + ")");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy() method called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean afterPropertiesSet() method called");
    }

    public void myInit() {
        System.out.println("myInit() method is called");
    }

    public void cleanUp() {
        System.out.println("my cleanUp() method is called");
    }
}
