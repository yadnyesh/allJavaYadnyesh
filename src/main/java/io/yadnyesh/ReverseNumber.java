package io.yadnyesh;

public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println("Reverse of 400 is: " + reverseNumber(456));
    }

    static int reverseNumber(int num) {
        int reverse = 0;
        while ( num != 0) {
            reverse = reverse*10 + num%10;
            num = num/10;
        }
        return reverse;
    }
}
