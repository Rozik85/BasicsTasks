package loopDoWhileFor.task1;

/**
 * 3.1 Napisz program, który za pomocą instrukcji for dla danych
 wartości x zmieniających się od 0 do 10 oblicza wartość
 funkcji y = 3x.
 */
public class EquationFor {
    public static void main(String[] args) {
        int y;
        System.out.println("Program oblicza równanie y=3*x");
        for (int x = 0; x < 11; x++) {
            System.out.print("Dla x= "+x+"\t");
            y=3*x;
            System.out.println("y= "+y+"\n");

        }
    }
}
