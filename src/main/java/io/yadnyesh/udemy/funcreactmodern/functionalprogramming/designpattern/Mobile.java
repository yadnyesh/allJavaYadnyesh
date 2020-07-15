package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.designpattern;

public class Mobile {
    final int ram;
    final int storage;
    final int camera;
    final String processor;
    final double screenSize;

    public Mobile(MobileBuilder builder) {
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.camera = builder.camera;
        this.processor = builder.processor;
        this.screenSize = builder.screenSize;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public int getCamera() {
        return camera;
    }

    public String getProcessor() {
        return processor;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "ram=" + ram +
                ", storage=" + storage +
                ", camera=" + camera +
                ", processor=" + processor +
                ", screenSize=" + screenSize +
                '}';
    }
}
