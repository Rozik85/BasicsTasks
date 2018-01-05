package loops.task1;

import java.util.Scanner;

import static java.lang.Math.*;

/**
 * 2.1 Napisz program, który sprawdza dla trzech boków trójkąta a,
 b i c wprowadzonych z klawiatury, czy tworzą one trójkąt prostokątny
 (zakładamy, że a > 0, b > 0, c > 0).
 */
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj bok a");
        float sideA = scanner.nextFloat();
        System.out.println("Podaj bok b");
        float sideB = scanner.nextFloat();
        System.out.println("Podaj bok c");
        float sideC = scanner.nextFloat();

        if (sideA>0 && sideB>0 && sideC>0){
            if(result(sideA, sideB, sideC) == true){
                System.out.println("Trójkąt jest prostokątny");
            }
            else System.out.println("Trójkąt nie jest prostokątny");
        }
        else System.out.println("Podaj wartosći większe od 0");
    }

    private static boolean result(double sideA, double sideB, double sideC) {
        if(pow(sideB, 2) + pow(sideA, 2) == pow(sideC,2)){
            return true;
        }
        else return false;
    }
}
