package tables.task7;

/**
 * 4.7 Napisz program, który w zadeklarowanej tablicy dwuwymiarowej
 * 10×10 umieszcza w pierwszej kolumnie liczby od 0 do 9,
 * w drugiej kwadraty tych liczb, natomiast w pozostałych kolumnach
 * 0 (interpretacja graficzna tablicy poniżej). Dodatkowo
 * program powinien obliczać osobno sumę liczb znajdujących się
 * w pierwszej oraz w drugiej kolumnie.
 */
public class SqrAndDimension {
    public static void main(String[] args) {
        int numberOfRow = 10;
        int numberOfColumn = 10;
        int sumFirstColum = 0;
        int sumSecendColum = 0;
        int macierz[][] = new int[numberOfRow][numberOfColumn];
        for (int i = 0; i < numberOfRow; i++) {
            for (int j = 0; j < numberOfColumn; j++) {
                if (j == 0) {
                    macierz[i][j] = i;
                    sumFirstColum=sumFirstColum+macierz[i][j];
                } else if (j == 1) {
                    macierz[i][j] = (int)Math.pow(i,2);
                    sumSecendColum=sumSecendColum+macierz[i][j];
                } else {
                    macierz[i][j] = 0;
                }
                System.out.print(macierz[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Suma pierwszej columny = " + sumFirstColum);
        System.out.println("Suma drugiej columny = " + sumSecendColum);
    }
}
