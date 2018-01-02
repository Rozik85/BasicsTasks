package iOOperations.task1;

import java.util.Scanner;

/**
 * Napisz program, który oblicza pole prostokąta. Wartości boków
 a i b wprowadzamy z klawiatury. W programie należy przyjąć,
 że zmienne a, b oraz pole są typu double (rzeczywistego).
 */
public class FieldOfTheRectangle {
    public static void main(String[] args) {
        double sideA, sideB;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj bok a");
        sideA = scanner.nextDouble();
        System.out.println("Podaj bok b");
        sideB = scanner.nextDouble();
        System.out.println("Pole prostokąta o boku a="+sideA+" oraz o boku b="+sideB+" wynosi: "+ fieldCalculation(sideA,sideB));
    }

    public static double fieldCalculation (double sideA, double sideB){
        return sideA*sideB;
    }
}
