package org.flysoohigh;

import org.flysoohigh.beans.Triangle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resources\\spring.xml");
        context.registerShutdownHook();
        Triangle triangle = (Triangle) context.getBean("triangle-alias");
        triangle.draw();
    }
}
