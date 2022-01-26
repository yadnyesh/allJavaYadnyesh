package io.yadnyesh.yt.algodsjavadines;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeComplexityDemoTest {

    TimeComplexityDemo timeComplexityDemo = new TimeComplexityDemo();

    @Test
    void findSumFormula() {
        assertEquals(5050, timeComplexityDemo.findSumFormula(100));
    }

    @Test
    void findSumLoop() {
        assertEquals(5050, timeComplexityDemo.findSumLoop(100));
    }
}