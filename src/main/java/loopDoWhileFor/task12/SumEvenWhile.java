package loopDoWhileFor.task12;

/**
 * Napisz program, który za pomocą instrukcji while sumuje
 * liczby parzyste w przedziale od 1 do 100.
 */
public class SumEvenWhile {
    public static void main(String[] args) {
        System.out.println("Program sumuje liczby parzyste z przedziału od 1 do 100");
        int sum = 0, i = 1;
        while (i <= 100) {
            if (i%2==0){
                sum += i;
                System.out.println(sum);
            }
            i++;
        }
    }
}
