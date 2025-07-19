package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculator {
    public void computeAreas() {
        Circle circle = new Circle(5);
        Rectangle rect = new Rectangle(4, 6);

        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Rectangle Area: " + rect.getArea());
    }
}

