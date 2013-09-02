/*
 * konzolno prilojenie za izvejdane na vremeto,za koeto raboti programata
 * ,za koeto shte syzdadeni 1000000000 chisla;
 */
package zad1;

public class Zad1 {

    public static void main(String[] args) {
        int sum = 0;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            sum++;
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("The time elapsed is %.6f sec",
                (endTime - startTime) / 1000.0);
    }
}
