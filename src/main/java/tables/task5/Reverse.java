package tables.task5;

/**
 * 4.5 Napisz program, który w zadeklarowanej tablicy dwuwymiarowej
 10×10 o nazwie macierz umieszcza liczby 1 i 0 zgodnie
 z zamieszczoną poniżej interpretacją graficzną. Program dodatkowo
 powinien obliczać sumę wyróżnionych elementów.
 */
public class Reverse {
    public static void main(String[] args) {
        int numberOfRow = 10;
        int numberOfColumn = 10;
        int macierz[][] = new int[numberOfRow][numberOfColumn];
        int sum = 0;
        for (int i = 0; i < numberOfRow; i++) {
            for (int j = 0; j < numberOfColumn; j++) {
                if (numberOfRow == i+j+1) {
                    macierz[i][j] = 1;
                    sum = sum + macierz[i][j];
                } else {
                    macierz[i][j] = 0;
                }
                System.out.print(macierz[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Suma elementów wyróżnionych = " + sum);
    }
}