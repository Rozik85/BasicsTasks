package tables.task6;

public class reverseDimensions {
    public static void main(String[] args) {
        int numberOfRow = 10;
        int numberOfColumn = 10;
        int sum = 0;
        int macierz[][] = new int[numberOfRow][numberOfColumn];

        for (int i = 0; i < numberOfRow; i++) {
            for (int j = 0; j < numberOfColumn; j++) {
                if (numberOfColumn == i + j + 1) {
                    macierz[i][j] = i;
                    sum = sum + macierz[i][j];
                } else {
                    macierz[i][j] = 0;
                }
                System.out.print(macierz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Suma elementów wyróżnionych =" + sum);
    }
}
