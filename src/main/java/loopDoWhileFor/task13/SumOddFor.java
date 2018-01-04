package loopDoWhileFor.task13;

/**
 * 3.13 Napisz program, który za pomocą instrukcji for sumuje liczby
 nieparzyste z przedziału od 1 do 100.
 */
public class SumOddFor {
    public static void main(String[] args) {
        int sum =0;
        System.out.println("Program sumuje liczby nieparzyste z przedziału od 1 do 100");
        for (int i = 0; i <=100 ; i++) {
            if (i % 2 == 1) {
                sum+=i;

            }
        }
        System.out.println("Suma neiparzystych liczb z przedziału to : "+sum);
    }
}
