package utils;

/*
Írjon valós Java függvényt, amely kiszámítja a fenti összeget!
Írjon utasítást, amely kiírja, hogy a=2 és n=150 esetén mennyi ez az összeg!
 */

public class F1 {
    public static void main(String[] args) {
        System.out.println(szamol(2, 150));
    }

    public static int szamol(int a, int n) {
        double s = 0.0;
        for (int i = a; i <= n; i++) {
            s += 1 / (i + 1);
            //System.out.println(s);
        }
        return (int)s;
    }
}
