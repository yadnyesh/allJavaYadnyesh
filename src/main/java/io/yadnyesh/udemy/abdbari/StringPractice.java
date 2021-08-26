package io.yadnyesh.udemy.abdbari;

public class StringPractice {
    public static void main(String[] args) {
        String str1 = "yadnyesh";
        System.out.println(str1.matches("[a-z]{5,10}"));

        int i = 4;
        switch (i)
        {
            case(1):
                System.out.println("One");
                break;
            case(2):
                System.out.println("Two");
                break;
            default:
                System.out.println("Neither one nor two");
        }

    }

}
