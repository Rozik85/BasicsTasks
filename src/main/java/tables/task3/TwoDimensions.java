package tables.task3;

/**
 * 4.3 Napisz program, który w zadeklarowanej tablicy dwuwymiarowej
 * 10×10 o nazwie macierz umieszcza na przekątnej liczbę 1,
 * a poza przekątną 0. Dodatkowo program powinien obliczać
 * sumę elementów wyróżnionych w tablicy, tj. tych znajdujących
 * się na jej przekątnej.
 */
public class TwoDimensions {
    public static void main(String[] args) {
        int numberOfRow = 10;
        int numberOfColumn = 10;
        int sum=0;
        int macierz[][] = new int[numberOfRow][numberOfColumn];

        for (int i = 0; i < numberOfRow; i++) {
            for (int j = 0; j < numberOfColumn; j++) {
                if (i == j) {
                    macierz[i][j] = 1;
                    sum=sum+macierz[i][j];
                } else {
                    macierz[i][j] = 0;
                }
                System.out.print(macierz[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Suma wyróżnionych elementów = "+sum );
    }
}
