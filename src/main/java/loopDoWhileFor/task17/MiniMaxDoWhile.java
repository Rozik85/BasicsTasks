package loopDoWhileFor.task17;

import java.util.Random;

/**
 * Napisz program, który za pomocą instrukcji do ... while
 * znajduje największą i najmniejszą liczbę ze zbioru n wylosowanych
 * liczb całkowitych od 0 do 99 (w zadaniu n = 5) oraz
 * oblicza średnią ze wszystkich wylosowanych liczb.
 */
public class MiniMaxDoWhile {
    public static void main(String[] args) {
        int maximumRange = 99;
        int minimumRange = 0;
        int numberOfRandomNumbers = 5;
        int min;
        int max;
        int drawnNumber;
        int i = 0;
        double sum;
        double average;
        System.out.println("Program pokazuje namniejszą i największa liczbę oraz średnią z " + numberOfRandomNumbers + " wylosowwanych " +
                "z przedziału od " + minimumRange + " do " + maximumRange + ".");
        Random random = new Random();

        drawnNumber = random.nextInt(maximumRange + 1);
        System.out.print("Wylosowane liczby to:\n" + drawnNumber);
        min = drawnNumber;
        sum = drawnNumber;
        max = min;
        do {
            drawnNumber = random.nextInt(maximumRange + 1);
            sum += drawnNumber;
            System.out.print("\t" + drawnNumber);
            if (min > drawnNumber) {
                min = drawnNumber;
            }
            if (max < drawnNumber) {
                max = drawnNumber;
            }
            i++;
        } while (i < numberOfRandomNumbers);

        average = sum / numberOfRandomNumbers;
        System.out.println("\nmin = " + min + "\tmax = " + max);
        System.out.println("Suma = " + sum);
        System.out.println("Srednia = " + average);
    }
}
