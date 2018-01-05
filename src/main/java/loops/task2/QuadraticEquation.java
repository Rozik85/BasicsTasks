package loops.task2;

import java.util.Scanner;

/**
 * 2.2 Napisz program, który oblicza pierwiastki równania kwadratowego
 ax2+bx+c = 0 z wykorzystaniem instrukcji warunkowej
 if, gdzie zmienne a, b i c to liczby rzeczywiste wprowadzane
 z klawiatury. Dla zmiennych a, b, c, x1 oraz x2 należy przyjąć
 format wyświetlania ich na ekranie z dokładnością do dwóch
 miejsc po przecinku.
 */
public class QuadraticEquation {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a");
        a = scanner.nextFloat();

        if (a == 0) {
            System.out.println("Niedozwolona wartość");
        } else {
            System.out.println("Podaj b");
            b = scanner.nextFloat();
            System.out.println("Podaj c");
            c = scanner.nextFloat();

            delta = Math.pow(b, 2) - (4 * a * c);
            if (delta < 0) {
                System.out.println("Nie ma pierwiastków");
            } else if (delta == 0) {
                x1 = (-b) / (2 * a);
                System.out.printf("Jeden pierwiastek:\nx1= %.2f\n", x1);
            } else {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.printf("Dwa pierwiastki:\nx1= %.2f \nx2= %.2f", x1, x2);
            }
        }
    }
}
