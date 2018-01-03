package iOOperations.task5;

/**
 * Napisz program, który oblicza wynik dzielenia całkowitego
 bez reszty dwóch liczb całkowitych: a = 37 i b = 11.
 */
public class Quotient {
    public static void main(String[] args) {

        int numberOne = 37;
        int numberTwo = 11;

        System.out.println("Liczba całkowita: "+ resultQuotient(numberOne, numberTwo)+
                " jest wynikiem dzielenia bez reszty dwoch liczb "+numberOne+ " oraz "+numberTwo+".");
    }
    public static int resultQuotient(int firstNumber, int secendNumber){
        return firstNumber/secendNumber;
    }
}
