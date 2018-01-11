package objects.task3;

/**
 * 5.3 Napisz zgodnie z zasadami programowania obiektowego program,
 który w tablicy 10×10 umieszcza losowo na przekątnej
 liczby od 0 do 9, a poza przekątną zera. Dodatkowo program
 oblicza sumę liczb znajdujących się na przekątnej. Klasa powinna
 zawierać trzy metody z parametrami:
 􀁔 czytaj_dane(double [][]macierz, int rozmiar) — metoda
 umieszcza dane w tablicy.
 􀁔 przetworz_dane(double [][]macierz, int rozmiar) — metoda
 oblicza i wyświetla sumę liczb znajdujących się na
 przekątnej.
 􀁔 wyswietl_wynik(double [][]macierz, int rozmiar) — metoda
 wyświetla zawartość tablicy na ekranie monitora.
 */
public class Main {
    public static void main(String[] args) {
        int size = 10;
        double [][]macierz = new double[size][size];
        MotherTable motherTable=new MotherTable();
        motherTable.readData(macierz,size);
        motherTable.processData(macierz,size);
        motherTable.showData(macierz,size);
    }
}
