package oper;
import ifff.Vichislator;

public class Minus implements Vichislator {
    @Override
    public int asc(int a, int b) {
        return a - b;
    }
}
