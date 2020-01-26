package io.yadnyesh;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        for(int lastUnsortedArray = intArray.length -1; lastUnsortedArray > 0; lastUnsortedArray--){

        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
