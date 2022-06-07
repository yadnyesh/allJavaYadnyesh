package io.yadnyesh.udemy.dsalgomasterclass;

public class RussianDollRecursion {
    public static void main(String[] args) {
        int num_of_dolls = 10;
        dolls_in_stack(num_of_dolls);
    }

   static void dolls_in_stack(int num_of_dolls) {
        if(num_of_dolls == 1) {
            System.out.println("Final Doll number --> " + num_of_dolls);
        } else {
            System.out.println("Doll number --> " + num_of_dolls);
            dolls_in_stack(num_of_dolls - 1);
        }
    }
}
