package loopDoWhileFor.task11;

/**
 * Napisz program, który za pomocą instrukcji do ... while sumuje
 liczby parzyste z przedziału od 1 do 100.
 */
public class SumEvenDoWhile {
    public static void main(String[] args) {
       int i= 1, sum=0;
        System.out.println("Program oblicza sume parzystych liczb z przedziału od 1 do 100");
        do {
            if (i % 2 == 0) {
                sum += i;
                System.out.println(sum);

            }
            i++;
        } while (i <= 100);
    }
}
