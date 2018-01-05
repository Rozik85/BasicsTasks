package iOOperations.task7;

import java.util.Scanner;

/**
 * 1.7 Napisz program, który oblicza sumę, różnicę, iloczyn i iloraz
 dla dwóch liczb x i y wprowadzanych z klawiatury. W programie
 należy założyć, że zmienne x i y są typu float (rzeczywistego).
 Dla zmiennych x, y, suma, roznica, iloczyn i iloraz
 należy przyjąć format ich wyświetlania na ekranie z dokładnością
 do dwóch miejsc po przecinku.
 */
public class Operators {
    public static void main(String[] args) {
        float firstNumber, secondNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        firstNumber = scanner.nextFloat();
        System.out.println("Podaj drugą liczbę");
        secondNumber = scanner.nextFloat();

        System.out.println("Wyniki działań na podanych liczbach");
        System.out.println("x = "+firstNumber+"\ny = "+secondNumber);
        System.out.printf("Suma = %.2f\n" ,resultSum(firstNumber, secondNumber));
        System.out.printf("Różnica = %.2f\n" ,resultSubtraction (firstNumber, secondNumber));
        System.out.printf("Iloczyn = %.2f\n" ,resultMultiplication(firstNumber, secondNumber));
        System.out.printf("Iloraz = %.2f\n" ,resultDivision(firstNumber, secondNumber));

    }

    private static float resultSubtraction(float firstNumber, float secondNumber) {
        return firstNumber-secondNumber;
    }

    private static float resultSum(float firstNumber, float secondNumber) {
        return firstNumber+secondNumber;
    }
    private static float resultMultiplication(float firstNumber, float secondNumber) {
        return firstNumber*secondNumber;
    }

    private static float resultDivision(float firstNumber, float secondNumber) {
        return firstNumber/secondNumber;
    }

}
