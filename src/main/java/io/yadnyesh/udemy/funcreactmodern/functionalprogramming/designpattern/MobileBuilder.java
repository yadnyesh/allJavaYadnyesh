package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.designpattern;

import io.yadnyesh.udemy.funcreactmodern.functionalprogramming.Consumer;

public class MobileBuilder {
    int ram;
    int storage;
    int camera;
    String processor;
    double screenSize;

    public MobileBuilder with(Consumer<MobileBuilder> buildFields) {
        buildFields.accept(this);
        return this;
    }

    public Mobile createMobile() {
        return new Mobile(this);
    }

}

