package loopDoWhileFor.task19;

/**
 * 3.19 Napisz program wyświetlający tabliczkę mnożenia dla liczb
 od 1 do 100 z wykorzystaniem podwójnej pętli for.
 */
public class MultiplicationFor {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+"\t");
            for (int j = 2; j <=10 ; j++) {
                System.out.print(i*j+"\t");
            }
            System.out.println();
        }
    }
}
