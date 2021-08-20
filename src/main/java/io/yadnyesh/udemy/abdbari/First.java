package io.yadnyesh.udemy.abdbari;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        System.out.println("Test");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Printing: " + firstNumber);
        System.out.println(Integer.toBinaryString(-5));
    }
}
