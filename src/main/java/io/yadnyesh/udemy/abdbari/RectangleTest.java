package io.yadnyesh.udemy.abdbari;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangleOne = new Rectangle();
        rectangleOne.setBreadth(3.23);
        rectangleOne.setLength(4.13);
        log.info("NoArgs Rectangle Area: " + rectangleOne.calculateArea());
        Rectangle rectangleTwo = new Rectangle(5.12, 6.11);
        log.info("AllArgs Rectangle Area: " + rectangleTwo.calculateArea());
    }
}
