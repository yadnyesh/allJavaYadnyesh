package io.yadnyesh.udemy.abdbari;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class Triangle {

    public static void main(String[] args) {
        log.info("This program calculates area of a Triangle ");
        log.info("Enter the breadth of the triangle");
        Scanner scanner = new Scanner(System.in);
        double breadthOfTriangle = scanner.nextDouble();
        log.info("Enter the length of the triangle");
        double lengthOfTriangle = scanner.nextDouble();
        double areaOfTriangle = calculateArea(lengthOfTriangle, breadthOfTriangle);
        log.info("The area of this triangle is: " + areaOfTriangle);
    }

    public static double calculateArea(double length, double breadth) {
        return (0.5) * length * breadth;
    }
}
