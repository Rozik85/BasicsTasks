package loopDoWhileFor.task10;

/**
 * Napisz program, który za pomocą instrukcji for sumuje liczby
 parzyste z przedziału od 1 do 100.
 */
public class SumEvenFor {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Program sumuje liczby parzyste z przedziału od 1 do 100");
        for (int i = 1; i <=100 ; i++) {
           if (i%2==0){
            sum = sum+i;
            System.out.println(sum);
        }}
    }
}
