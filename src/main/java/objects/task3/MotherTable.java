package objects.task3;

import java.util.Random;

public class MotherTable {

    public void readData(double[][] macierz, int size) {
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    macierz[i][j] = random.nextInt(9);
                } else {
                    macierz[i][j] = 0;
                }
            }
        }
    }

    public void processData(double[][] macierz, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum += macierz[i][j];
            }
        }
        System.out.println("Suma liczb po przekatnej : " + sum);
    }

    public void showData(double[][] macierz, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print((int)macierz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
