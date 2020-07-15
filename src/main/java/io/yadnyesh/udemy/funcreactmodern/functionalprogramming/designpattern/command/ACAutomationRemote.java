package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.designpattern.command;

public class ACAutomationRemote {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void buttonPressed() {
        command.execute();
    }
}
