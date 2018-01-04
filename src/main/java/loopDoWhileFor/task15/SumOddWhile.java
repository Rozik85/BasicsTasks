package loopDoWhileFor.task15;

/**
 * 3.15 Napisz program, który za pomocą instrukcji while sumuje
 * liczby nieparzyste w przedziale od 1 do 100.
 */
public class SumOddWhile {
    public static void main(String[] args) {
        int i = 1, sum = 0;
        System.out.println("Program oblicza sumę licz nieparzystych w przedziale od 1 do 100");
        while (i <= 100) {
            if (i % 2 == 1) {
                sum += i;
            }
            i++;
        }
        System.out.println("Suma wynosi:"+sum);
    }
}
