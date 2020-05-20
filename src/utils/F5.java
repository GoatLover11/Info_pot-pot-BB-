package utils;

/*

Definiálja a következő valós-valós matematikai függvényt, használja a Math.exp függvényt!

Írjon utasítást, amely két tizedes pontossággal kiírja az g függvény értékét a 0 helyen!
 */

public class F5 {
    public static void main(String[] args) {
        System.out.printf("%.2f", gx(0));
    }

    public static double gx(double x){
        double y = 0.0;
        y = x > 1 ? 2*x / (x - 1) : Math.exp(x - 1);
        return  y;
    }
}
