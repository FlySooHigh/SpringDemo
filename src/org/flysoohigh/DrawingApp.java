package org.flysoohigh;

import org.flysoohigh.beans.Triangle;
import org.flysoohigh.interfaces.Shape;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String[] args) {
        // TODO: 09.01.2019 Add full logging of spring initialization to console
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resources\\spring.xml");
        context.registerShutdownHook();
        Shape shape = (Shape) context.getBean("circle");
        shape.draw();
    }
}
