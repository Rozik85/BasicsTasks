package loopDoWhileFor.task14;

/**
 * 3.14 Napisz program, który za pomocą instrukcji do ... while sumuje
 * liczby nieparzyste w przedziale od 1 do 100.
 */
public class SumOddDoWhile {
    public static void main(String[] args) {
        int sum = 0, i = 1;
        System.out.println("Program sumuje liczby nieparzyste w przedziale od 1 do 100");
        do {
            if (i % 2 == 1) {
                sum += i;
            }
            i++;
        } while (i <= 100);
        System.out.println("Suma wynosi" + sum);
    }
}
