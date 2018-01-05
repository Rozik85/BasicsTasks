package loopDoWhileFor.task20;

/**
 * 3.20 Napisz program wyświetlający tabliczkę mnożenia dla liczb
 * od 1 do 100 z wykorzystaniem podwójnej pętli do ... while.
 */
public class MultiplicationDoWhile {
    public static void main(String[] args) {
        int i = 1, j = 1;
        do {j=1;
            do {
                System.out.print(i * j+"\t");
                j++;
            } while (j <= 10);
            System.out.println();
            i++;
        } while (i <= 10);
    }
}
