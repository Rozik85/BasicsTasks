package tables.task1;

/**
 * 4.1 Napisz program, który w 10-elementowej tablicy jednowymiarowej
 o nazwie dane umieszcza liczby od 0 do 9 (zobacz
 poniżej reprezentację graficzną tablicy).
 */
public class FilingBoard {
    public static void main(String[] args) {
int boardSize = 10;
int dane[] = new int[boardSize];
        for (int i = 0; i < dane.length; i++) {
            dane[i]=i;
            System.out.println("dane["+i+"]="+dane[i]);
        }
    }
}
