package objects.task4;

import java.util.Random;

public class SortTable {

    public void readData(int numbers[], int n) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            numbers[i] = random.nextInt(100);
        }
    }

    public void process(int numbers[], int n) {
        int licznik;
        int temp;
        System.out.print("Liczby przed sortowaniem : ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i]+"\t");
        }
        System.out.println();
        do {
            licznik = 0;
            for (int i = 1; i < n; i++) {
                if (numbers[i - 1] > numbers[i]) {
                    temp = numbers[i - 1];
                    numbers[i - 1] = numbers[i];
                    numbers[i] = temp;
                    licznik = 1;
                }
            }
        } while (licznik == 1);

    }

    public void show(int numbers[], int n) {

        System.out.print("Liczby po sortowaniu : ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i]+"\t");
        }
    }
}
