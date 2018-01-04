package loopDoWhileFor.task2;

/**
 * .2 Napisz program, który za pomocą instrukcji do ... while dla
 danych wartości x zmieniających się od 0 do 10 oblicza wartość
 funkcji y = 3x.
 */
public class EquationDo {
    public static void main(String[] args) {
        int y = 0, x = 0;
        System.out.println("Program oblicza wartość funkcji y=3*x dla " +
                "x zmieniającego się od 0 do 10");

        do {
            y = 3 * x;
            System.out.println("x= " + x + "\t" + "y= " + y);
            x++;
        } while (x <= 10);
    }
}
