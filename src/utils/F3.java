package utils;

/*
Írjon egész Java függvényt, amely generál 9 darab [1,40] közé eső egész számot, amit eltárol egy B nevű tömbben, és megadja, hogy a B tömbben hány darab 25-től kisebb szám van!
Írjon utasítást, amely kiírja, hogy a 9 véletlen szám között (vagyis M tömbben) hány darab 25-től kisebb szám van!
 */

public class F3 {
    public static void main(String[] args) {
        System.out.println(ranGen(9));
    }

    public static int ranGen(int n){
        int db = 0;
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            B[i] = (int) (Math.random()*40);
            if (B[i] < 25) db++;
        }
        return db;
    }
}
