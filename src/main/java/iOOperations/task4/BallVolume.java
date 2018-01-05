package iOOperations.task4;

import java.util.Scanner;

/**
 * 1.4 Napisz program, który oblicza objętość kuli o promieniu r.
 Wartość promienia wprowadzamy z klawiatury. W programie
 należy przyjąć, że zmienne: promień r i objetosc, są typu double
 (rzeczywistego). Dla tych zmiennych należy przyjąć format
 wyświetlania na ekranie z dokładnością do dwóch miejsc po
 przecinku.
 */
public class BallVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promień kuli");
        double radius = scanner.nextDouble();
        System.out.printf("Objętość koła o promieniu "+"%.2f"+" wynosi:"+"%.2f",radius,calculationVolumeBall(radius));
    }
    public static double calculationVolumeBall (double radius){
        return 4.0/3*Math.PI*Math.pow(radius, 3);
    }
}
