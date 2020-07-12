package io.yadnyesh.udemy.funcreactmodern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FunctionalGenericsImpl {

    public static void main(String[] args) {
        FunctionalGenerics<String, String> functionalGenerics = s -> s.substring(1, 5);
        log.info(functionalGenerics.execute("Yadnyesh"));

        FunctionalGenerics<String, Integer> strlength = String::length;
        log.info(strlength.execute("BasicsStrong1").toString());
    }
}
