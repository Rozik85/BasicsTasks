package tables.task8;

/**
 4.8 Dane są dwie tablice dwuwymiarowe 10×10 o nazwach a i b.
 Tablica a zawiera elementy przedstawione poniżej.
 0 1 2 3 4 5 6 7 8 9
 0 1 2 3 4 5 6 7 8 9
 0 1 2 3 4 5 6 7 8 9
 0 1 2 3 4 5 6 7 8 9
 0 1 2 3 4 5 6 7 8 9
 0 1 2 3 4 5 6 7 8 9
 0 1 2 3 4 5 6 7 8 9
 0 1 2 3 4 5 6 7 8 9
 0 1 2 3 4 5 6 7 8 9
 0 1 2 3 4 5 6 7 8 9
 Tablica b zawiera same zera. Napisz program, który przepisuje zawartość
 tablicy a do tablicy b (interpretacja graficzna tablicy wynikowej
 poniżej), zamieniając kolumny na wiersze.
 0 0 0 0 0 0 0 0 0 0
 1 1 1 1 1 1 1 1 1 1
 2 2 2 2 2 2 2 2 2 2
 3 3 3 3 3 3 3 3 3 3
 4 4 4 4 4 4 4 4 4 4
 5 5 5 5 5 5 5 5 5 5
 6 6 6 6 6 6 6 6 6 6
 7 7 7 7 7 7 7 7 7 7
 8 8 8 8 8 8 8 8 8 8
 9 9 9 9 9 9 9 9 9 9
 */
public class TwoTables {
    public static void main(String[] args) {
        int numberOfRow =10;
        int numberOfColumn =10;
        int firstTableA[][] = new int[numberOfRow][numberOfColumn];
        int secendTableB[][] = new int[numberOfRow][numberOfColumn];
        System.out.println("Pierwsza macierz A:");
        for (int i = 0; i < numberOfRow; i++) {
            for (int j = 0; j < numberOfColumn; j++) {
                firstTableA[i][j]=j;
                System.out.print(firstTableA[i][j]+"\t");
                secendTableB[j][i]=firstTableA[i][j];
            }
            System.out.println();
        }
        System.out.println("Druga macierz B:");
        for (int i = 0; i < numberOfRow; i++) {
            for (int j = 0; j < numberOfColumn; j++) {
                System.out.print(secendTableB[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
