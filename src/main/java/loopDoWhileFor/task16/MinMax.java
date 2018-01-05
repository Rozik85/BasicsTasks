package loopDoWhileFor.task16;

import java.util.Random;

/**
 * 3.16 Napisz program, który za pomocą instrukcji for znajduje największą
 i najmniejszą liczbę ze zbioru n wylosowanych liczb
 całkowitych od 0 do 99 (w zadaniu n = 5) oraz oblicza średnią
 ze wszystkich wylosowanych liczb.
 */
public class MinMax {
    public static void main(String[] args) {
int maximumRange=99;
int minimumRange=0;
int numberOfRandomNumbers=5;
int min=maximumRange+1;
int max=minimumRange;
double sum=0;
double average;
        System.out.println("Program pokazuje namniejszą i największa liczbę oraz średnią z "+numberOfRandomNumbers+" wylosowwanych " +
                "z przedziału od "+minimumRange+" do "+maximumRange+".");
        Random random = new Random();
        int[] tablica = new int[numberOfRandomNumbers];
        System.out.println("Wylosowane liczby to:");
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(100);
            sum+=tablica[i];
            System.out.print(i+1+":"+tablica[i]+"\t");
            if(min>tablica[i]){
                min=tablica[i];
            }
            if (max<tablica[i]){
                max=tablica[i];
            }
        }
        average=sum/numberOfRandomNumbers;
        System.out.println("\nmin = "+min+"\tmax = "+max);
        System.out.println("Suma = " + sum);
        System.out.println("Srednia = "+average);
    }
}
