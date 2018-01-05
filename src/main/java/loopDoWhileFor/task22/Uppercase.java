package loopDoWhileFor.task22;

/**
 * 3.22 Napisz program, który wyświetla duże litery alfabetu od A do
 Z i od Z do A z wykorzystaniem pętli for.
 */
public class Uppercase {
    public static void main(String[] args) {
       char znak;
        System.out.println("Program wyświetla duże litery alfabety od A do Z i od Z do A.");
        for ( znak = 'A'; znak <='Z' ; znak++) {
            System.out.print(znak+",");
        }
        System.out.println();
        for (znak = 'Z'; znak >= 'A'; znak--) {
            System.out.print(znak+",");
        }
    }
}
