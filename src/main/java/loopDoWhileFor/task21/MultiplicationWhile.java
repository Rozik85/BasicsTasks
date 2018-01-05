package loopDoWhileFor.task21;

/**
 * 3.21 Napisz program wyświetlający tabliczkę mnożenia dla liczb
 od 1 do 100 z wykorzystaniem podwójnej pętli while.
 */
public class MultiplicationWhile {
    public static void main(String[] args) {
        int i=1, j=1;
        while (i<=10){
            j=1;
            while(j<=10){
                System.out.print(i*j+"\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
