package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.designpattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BuilderDemo {
    public static void main(String[] args) {
        MobileBuilder mobileBuilder = new MobileBuilder();
        Mobile myMobile = mobileBuilder.with(myBuilder -> {
            myBuilder.ram = 4;
            myBuilder.camera = 12;
        }).createMobile();
        log.info(myMobile.toString());
    }
}
