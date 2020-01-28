package io.yadnyesh;

public class JavaCloning implements Cloneable{
    int i = 10;
    int j = 20;

    public static void main(String[] args) throws CloneNotSupportedException {
        JavaCloning jc1 = new JavaCloning();
        JavaCloning jc2 = (JavaCloning) jc1.clone();
        jc2.i = 888;
        jc2.j = 999;
        System.out.println("JC 1: " + jc1.i + "  " + jc1.j);
        System.out.println("JC 2: " + jc2.i + "  " + jc2.j);

    }
}
