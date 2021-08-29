package io.yadnyesh.udemy.abdbari;

public class ArrayPractice {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        ArrayPractice arrayPractice = new ArrayPractice();
        arrayPractice.update(a, 0, 20);
        for(int x: a){
            System.out.println(x);
        }
    }

    void update(int a[], int index, int newValue) {
        a[index] = newValue;
    }
}
