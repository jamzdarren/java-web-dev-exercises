package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter the radius: " );
        radius = input.nextDouble();

        while (radius < 0 || Double.isNaN(radius)) {
            System.out.println("Enter the radius: " );
            radius = input.nextDouble();
        }
        area = Circle.getArea(radius);
        input.close();
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
