package oper;
import ifff.Vichislator;

public class Delit implements Vichislator {
    @Override
    public int asc(int a, int b) {
        int rez = a / b ;
        return (rez);
    }
}
