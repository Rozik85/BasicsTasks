package objects.task2;


import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c, x1, x2, delta;
    char numberOfElements;

    public void reed() {
        System.out.println("Program oblicza pierwiastek równania kwadratowego ax^2+bx+c");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a :");
        a = scanner.nextDouble();
        if (a == 0) {
            System.out.println("Podana wartość jest błędna. a nie może = 0");
            System.exit(1);
        } else {
            System.out.println("Podaj b :");
            b = scanner.nextDouble();
            System.out.println("Podaj c : ");
            c = scanner.nextDouble();
        }
    }

    public void process() {
        delta = Math.pow(b, 2) - (4 * a * c);
        if (delta < 0) {
            numberOfElements = 0;
        }
        if (delta == 0) {
            numberOfElements = 1;
        }
        if (delta > 0) {
            numberOfElements = 2;
        }
        switch (numberOfElements) {
            case 1:
                x1 = -b / (2 * a);
                break;
            case 2:
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                break;
        }
    }
    public void show() {
        switch (numberOfElements) {
            case 0:
                System.out.println("Brak pierwiastków");
                break;
            case 1:
                System.out.printf("x1 = %.2f", x1);
                break;
            case 2:
                System.out.printf("x1 = %.2f\tx2 = %.2f", x1, x2);
                break;
        }
    }
}