package loopDoWhileFor.task6;

/**
 * 3.6 Napisz program, który za pomocą instrukcji while wyświetla
 liczby całkowite od 1 do 20.
 */
public class CountingWhile {
    public static void main(String[] args) {
        int i=1;
        System.out.println("Program wyświetla liczby całkowite od 1 do 20.");
        while (i <= 20) {
            System.out.println(i);
            i++;
        }
    }
}
