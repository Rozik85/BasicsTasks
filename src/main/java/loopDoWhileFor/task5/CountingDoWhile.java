package loopDoWhileFor.task5;

/**
 * Napisz program, który za pomocą instrukcji do ... while wyświetla
 liczby całkowite od 1 do 20.
 */
public class CountingDoWhile {
    public static void main(String[] args) {
        System.out.println("Program wyświetla liczby całkowite od 1 do 20.");
        int i=1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 20);
    }
}
