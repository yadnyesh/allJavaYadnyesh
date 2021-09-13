package io.yadnyesh.udemy.abdbari.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CalculateAreaForExceptionExample {
    public static void main(String[] args) {
        try {
            log.info(String.valueOf(calculateAreaOfRectangle(5,-9)));
        } catch (AreaInputsZeroOrNegative e) {
            log.info(e.toString());
        }
    }

    public static float calculateAreaOfRectangle(float length, float breadth) throws AreaInputsZeroOrNegative {
        if( length <= 0 || breadth <=0) {
            throw new AreaInputsZeroOrNegative();
        }
        else {
            return length * breadth;
        }
    }

}
