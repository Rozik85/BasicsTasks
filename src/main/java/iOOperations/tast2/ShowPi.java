package iOOperations.tast2;

/**
 * Napisz program, który wyświetla na ekranie komputera wartość
 predefiniowanej stałej π = 3,14… Należy przyjąć format wyświetlania
 tej stałej z dokładnością do pięciu miejsc po przecinku.
 */
public class ShowPi {
    public static void main(String[] args) {
        System.out.printf("Pi= "+"%6.5f\n", Math.PI);
    }
}
