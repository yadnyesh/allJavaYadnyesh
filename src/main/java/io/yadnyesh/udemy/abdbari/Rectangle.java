package io.yadnyesh.udemy.abdbari;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rectangle {
    private double length = 0;
    private double breadth = 0;

    public double calculateArea() {
        return this.breadth * this.length;
    }

    public double calculatePerimeter() {
        return 2 * (this.breadth + this.length);
    }
}
