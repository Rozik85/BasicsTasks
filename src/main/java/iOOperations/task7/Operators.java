package iOOperations.task7;

import java.util.Scanner;

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
