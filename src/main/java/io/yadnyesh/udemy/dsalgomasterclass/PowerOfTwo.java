package io.yadnyesh.udemy.dsalgomasterclass;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PowerOfTwo {
    public static void main(String[] args) {
        int raiseTwoTo = 4;
        int result = powerOfTwo(raiseTwoTo);
        log.info(String.valueOf(result));
    }

    private static int powerOfTwo(int raiseTwoTo) {
        if(raiseTwoTo == 0) {
            return 1;
        }
        else
            return 2 * powerOfTwo(raiseTwoTo - 1);
    }
}
