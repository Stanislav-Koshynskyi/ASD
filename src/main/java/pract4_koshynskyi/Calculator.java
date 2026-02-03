package pract4_koshynskyi;

public class Calculator {
    public float divide(int a, int b){
        if (b == 0) throw new IllegalArgumentException("divide by zero");
        return a / (float)b;
    }
}
