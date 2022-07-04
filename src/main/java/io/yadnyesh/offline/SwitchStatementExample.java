package io.yadnyesh.offline;

public class SwitchStatementExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        switch (x+1) {
            case  (10):
                System.out.println("10");
            case  (1):
                System.out.println("1");
                break;
            case (11):
                System.out.println("11");
                break;
            default:
                System.out.println("default");
        }
    }
}
