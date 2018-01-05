package iOOperations.task6;

/**
 * 1.6 Napisz program, który oblicza resztę z dzielenia całkowitego
 dwóch liczb całkowitych: a = 37 i b = 11.
 */
public class Modulo {
    public static void main(String[] args) {
        int numberOne = 37;
        int numberTwo = 11;

        System.out.println("Program oblicza resztę dzielenia z dwóch liczb");
        System.out.println("a= "+numberOne);
        System.out.println("b= "+numberTwo);
        System.out.println(numberOne+" % "+numberTwo+"="+ resultModulo(numberOne,numberTwo));
    }

    private static int resultModulo(int numberOne, int numberTwo) {
        return numberOne%numberTwo;
    }
}
