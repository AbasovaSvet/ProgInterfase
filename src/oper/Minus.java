package oper;
import ifff.Vichislator;

public class Minus implements Vichislator {
    @Override
    public int asc(int a, int b) {
        int rez = a - b ;
        return (rez);
    }
}
