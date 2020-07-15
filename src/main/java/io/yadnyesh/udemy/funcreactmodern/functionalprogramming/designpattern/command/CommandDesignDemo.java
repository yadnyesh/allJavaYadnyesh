package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.designpattern.command;

public class CommandDesignDemo {
    public static void main(String[] args) {
        AirConditioner ac1 = new AirConditioner();
        AirConditioner ac2 = new AirConditioner();

        ACAutomationRemote remote = new ACAutomationRemote();
        remote.setCommand(() -> ac2.turnOn());
        remote.buttonPressed();
    }
}
