package io.yadnyesh.udemy.abdbari.abstractexample;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class Circle extends Shape{
    private double PI = 3.14;
    private double radius = 2.13;

    @Override
    void perimeter() {
        log.info("The perimeter of the circle is: " + 2*PI*radius);
    }

    @Override
    void area() {
        log.info("Area of the circle is: " + PI * radius * radius);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.perimeter();
        circle.area();
    }
}
