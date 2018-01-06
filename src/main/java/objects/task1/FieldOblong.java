package objects.task1;

import java.util.Scanner;

public class FieldOblong {
    private double sideA, sideB, field;

    public void reedData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość boku A:");
        sideA = scanner.nextDouble();
        System.out.println("Podaj długość boku B:");
        sideB = scanner.nextDouble();
    }
    public void processData() {
        field = sideA * sideB;
    }
    public void showData(){
        System.out.printf("Bok A = %.2f\nBok B = %.2f\nPole = %.2f",sideA,sideB,field);
    }
}
