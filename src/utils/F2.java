package utils;

/*
Definiálja az f valós paraméterű, homerseklet nevű függvényt, amely az alábbi képlet alapján a megadott Fahrenheit fokot átkonvertálja Celsius fokká!
[oC]=([oF]-32):1.8
Írjon utasítást, amely kéttizedes pontossággal kiírja, hogy 100 Fahrenheit fok hány Celsius fok!
 */

public class F2 {
    public static void main(String[] args) {
        System.out.printf("%.2f", homerseklet(100));
    }

    public static float homerseklet(float f){
        return (float) ((f -32) / 1.8);
    }
}
