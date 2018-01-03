package iOOperations.task3;

/**
 * Napisz program, który wyświetla na ekranie komputera pierwiastek
 kwadratowy z wartości predefiniowanej π = 3,14…
 Należy przyjąć format wyświetlania pierwiastka kwadratowego
 ze stałej π z dokładnością do dwóch miejsc po przecinku.
 */
public class SqrtPi {
    public static void main(String[] args) {
        System.out.printf("Pierwiastek z PI ="+"%.2f", Math.sqrt(Math.PI));
    }
}
