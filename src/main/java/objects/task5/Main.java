package objects.task5;

/**
 * 5.5 Napisz program, który rekurencyjnie oblicza kolejne wartości
 n! dla n = 10 i wynik wyświetla na ekranie komputera.
 */
public class Main {
    public static void main(String[] args) {
        int n=10;
        FactorialFunction factorialFunction = new FactorialFunction();
        System.out.println("Obliczanie silni dla n=10");
        for (int i = 0; i < n; i++) {
            System.out.println(" "+i +"!="+factorialFunction.factorial(i));
        }
    }
}
