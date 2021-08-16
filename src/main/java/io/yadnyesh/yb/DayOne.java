package io.yadnyesh.yb;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DayOne {

    public static void main(String[] args) {
        String firstString = "Yadnyesh";
        String lastString = "Yadnyesh";
        String reverseString;

        for (int i = 0; i < firstString.length(); i++) {
            log.info(String.valueOf(firstString.charAt(i)));
        }

    }
}
