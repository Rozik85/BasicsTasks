package loops.task5;

import java.util.Random;
import java.util.Scanner;

/**
 * Napisz program, w którym użytkownik zgaduje losową liczbę
 z przedziału od 0 do 9 generowaną przez komputer.
 */
public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number;
        double randomNumber;
        randomNumber = Math.round(10*(random.nextDouble()));
            System.out.println("Podaj liczbę z przedziału od 0 do 9");
            number = scanner.nextInt();
            if (number != (int)randomNumber){
                System.out.println("Nie trafiłeś, poprawna liczba to "+(int)randomNumber);
            }else
                System.out.println("Brawo trafiłes. Podana liczba:"+number+" jest równa liczbie losowej "+(int)randomNumber);
    }
}
