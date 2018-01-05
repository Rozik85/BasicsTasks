package loopDoWhileFor.task18;

import java.util.Random;

public class MiniMaxWhile {
    /**
     * 3.18 Napisz program, który za pomocą instrukcji while znajduje
     * największą i najmniejszą liczbę ze zbioru n wylosowanych
     * liczb całkowitych od 0 do 99 (w zadaniu n
     */
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
        while (i < numberOfRandomNumbers) {
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
        }
        average = sum / numberOfRandomNumbers;
        System.out.println("\nmin = " + min + "\tmax = " + max);
        System.out.println("Suma = " + sum);
        System.out.println("Srednia = " + average);
    }
}
