package objects.task4;

/**
 * 5.4 Napisz zgodnie z zasadami programowania obiektowego program,
 * który sortuje n liczb (w programie jest ich sześć). Klasa
 * powinna zawierać trzy metody z parametrami:
 * 􀁔 czytaj_dane(int [] liczby, int n) — metoda czyta dane
 * i umieszcza je w tablicy o nazwie liczby.
 * 􀁔 przetworz_dane(int [] liczby, int n) — metoda sortuje dane
 * według wybranego algorytmu sortowania (w programie
 * wykorzystano algorytm sortowania bąbelkowego).
 * 􀁔 wyswietl_wynik(int [] liczby, int n) — metoda wyświetla
 */
public class Main {
    public static void main(String[] args) {

        int n =6;
        int numbers[]= new int[n];
        SortTable sortTable = new SortTable();

        sortTable.readData( numbers, n);
        sortTable.process(numbers, n);
        sortTable.show(numbers, n);

    }
}
