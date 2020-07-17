package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.designpattern.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AirConditioner {
    public void turnOn() {
        log.info("turning on AC");
    }
    public void turnOff() {
        log.info("turning off AC");
    }
    public void incTemp() {
        log.info("Increasing the temprature");
    }
    public void decTemp() {
        log.info("Decreasing temprature");
    }
}
