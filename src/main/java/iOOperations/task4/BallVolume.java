package iOOperations.task4;

import java.util.Scanner;

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
