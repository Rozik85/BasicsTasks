package loops.task4;

import java.util.Scanner;

/**
 * 2.4 Napisz program, który oblicza wartość x z równania ax+b = c.
 Wartości a, b i c należą do zbioru liczb rzeczywistych i są
 wprowadzane z klawiatury. Dodatkowo należy zabezpieczyć
 program na wypadek sytuacji, kiedy wprowadzona wartość a
 będzie równa zero. Dla zmiennych a, b, c oraz x należy przyjąć
 format wyświetlania ich na ekranie z dokładnością do
 dwóch miejsc po przecinku.
 */
public class Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, x;
        System.out.println("Program oblicza \"x\" z równiania ax+b=c");
        System.out.println("Podaj a");
        a = scanner.nextDouble();
        if (a == 0) {
            System.out.printf("Niedozwolona wartość a nie może = 0.");
        } else {
            System.out.println("Podaj b");
            b = scanner.nextDouble();
            System.out.println("Podaj c");
            c = scanner.nextDouble();
            x = (c - b) / a;
            System.out.printf("Równanie ax+b=c\na= %.2f\nb= %.2f\nc= %.2f\n",a,b,c);
            System.out.printf("x= %.2f", x);
        }
    }
}
