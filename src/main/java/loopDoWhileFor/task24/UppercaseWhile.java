package loopDoWhileFor.task24;

/**
 * 3.24 Napisz program, który wyświetla duże litery alfabetu od A do
 Z i od Z do A z wykorzystaniem pętli while.
 */
public class UppercaseWhile {
    public static void main(String[] args) {
        char znak ='A';
        while(znak<='Z'){
            System.out.print(znak +",");
            znak++;
        }
        System.out.println();
        znak ='Z';
        while (znak>='A'){
            System.out.print(znak+",");
            znak--;
        }
    }
}
