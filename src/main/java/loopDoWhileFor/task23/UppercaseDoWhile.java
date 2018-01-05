package loopDoWhileFor.task23;

/**
 * 3.23 Napisz program, który wyświetla duże litery alfabetu od A do
 * Z i od Z do A z wykorzystaniem pętli do ... while.
 */
public class UppercaseDoWhile {
    public static void main(String[] args) {
        char znak = 'A';
        System.out.println("Program wyświetla duże litery alfabety od A do Z i od Z do A.");
        do {
            System.out.print(znak + ",");
            znak++;
        } while (znak <= 'Z');
        System.out.println();
        znak = 'Z';
        do {
            System.out.print(znak + ",");
            znak--;
        } while (znak >= 'A');
    }
}
