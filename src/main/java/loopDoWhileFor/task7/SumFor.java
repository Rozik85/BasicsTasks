package loopDoWhileFor.task7;

/**
 * Napisz program, który przy użyciu instrukcji for sumuje
 liczby całkowite od 1 do 100.
 */
public class SumFor {
    public static void main(String[] args) {
        int a=0;
        System.out.println("Program sumuje liczby całkowite od 1 do 100");
        for (int i = 1; i <= 100; i++) {
            a=a+i;
            System.out.println(a);

        }
    }
}
