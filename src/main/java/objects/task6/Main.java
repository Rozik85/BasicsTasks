package objects.task6;

/**
 * 5.6 Napisz program, który rekurencyjnie znajduje 10 pierwszych
 liczb trójkątnych i wyświetla je na ekranie komputera.
 Wskazówka
 W matematyce liczba trójkątna to taka, którą można zapisać w postaci sumy
 kolejnych początkowych liczb naturalnych: Tn = 1 + 2 + 3 + (n – 1)
 + n. Liczby należące do tego ciągu nazywane są trójkątnymi, gdyż można je
 przedstawić w formie trójkąta. Na przykład #6 = 21.
 #1 1
 #2 2 1
 #3 3 2 1
 #4 4 3 2 1
 #5 5 4 3 2 1
 #6 6 5 4 3 2 1
 Kolejne elementy ciągu uzyskujemy w sposób następujący:
 #1 = 1
 #2 = 1 + 2 = 3
 #3 = 1 + 2 + 3 = 6
 #4 = 1 + 2 + 3 + 4 = 10
 #5 = 1 + 2 + 3 + 4 + 5 = 15
 #6 = 1 + 2 + 3 + 4 + 5 + 6 = 21 itd.
 */
public class Main {
    public static void main(String[] args) {
        int n=10;
        TriangularNumber triangularNumber = new TriangularNumber();
        for (int i = 1; i <= n; i++) {
            System.out.println("#"+i +"="+triangularNumber.triangular(i));
        }

    }
}
