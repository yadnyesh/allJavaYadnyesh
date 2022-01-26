package io.yadnyesh.yt.algodsjavadines;

public class TimeComplexityDemo {
    public static void main(String[] args) {
      TimeComplexityDemo timeComplexityDemo = new TimeComplexityDemo();
    }

    public int findSumFormula(int n) {
        return n * (n+1)/2;
    }

    public int findSumLoop(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++ ) {
            sum = sum + i;
        }
        return sum;
    }
}
