package io.yadnyesh.udemy.abdbari;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    public void testCalculateArea() {
        double expectedResult = Triangle.calculateArea(10,10);
        assertEquals(50, expectedResult);
    }


}