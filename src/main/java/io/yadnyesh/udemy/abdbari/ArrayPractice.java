package io.yadnyesh.udemy.abdbari;

public class ArrayPractice {
    public static void main(String[] args) {
        int anInt[] = new int[10];
        int newInt[] = {2,4,6,8,10};
        for(int i=0; i < newInt.length; i++) {
            System.out.println(newInt[i]);
        }
        System.out.println("New For loop syntax");
        for (int x: newInt) {
            System.out.println(x);
        }
    }
}
